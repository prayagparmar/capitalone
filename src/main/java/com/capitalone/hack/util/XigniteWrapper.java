package com.capitalone.hack.util;

import com.capitalone.hack.XignitSuggestions.XigniteGlobalIndices;
import com.capitalone.hack.XignitSuggestions.XigniteIndexValue;
import com.capitalone.hack.wrapper.httpclient.HttpClient;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by shashankdass on 3/8/15.
 */
public class XigniteWrapper {

    HttpClient httpClient = new HttpClient();
    ObjectMapper mapper = new ObjectMapper();
    public XigniteGlobalIndices getIndexByName( String name) throws IOException {
        String url = "http://globalindices.xignite.com/xglobalindices.json/SearchIndicesByName?_Token=E208B2F5497C4880B593EBFC90856142&&IndexName="+name;
        String jsonIndices = httpClient.sendGetXignite(url);
        jsonIndices = jsonIndices.substring(jsonIndices.indexOf('[')+1,jsonIndices.indexOf(']'));
        XigniteGlobalIndices indices = mapper.readValue(jsonIndices, XigniteGlobalIndices.class);
        return indices;

    }
    public XigniteIndexValue getIndexValue( String name) throws IOException {
        String url = "http://globalindices.xignite.com/xglobalindices.json/GetDelayedIndexValue?_Token=E208B2F5497C4880B593EBFC90856142&&IdentifierType=Symbol&Identifier="+name;

        String jsonIndices = httpClient.sendGetXignite(url);
        //jsonIndices = jsonIndices.substring(jsonIndices.indexOf('[')+1,jsonIndices.indexOf(']'));
        XigniteIndexValue values = mapper.readValue(jsonIndices, XigniteIndexValue.class);
        return values;

    }
}
