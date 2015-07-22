package com.capitalone.hack.util;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * User: prayagparmar
 * Date: 3/7/15
 * Time: 2:29 PM
 */
public class PlotlyManager {
    public static void main(String[] args) throws IOException {
        PlotlyManager plotlyManager = new PlotlyManager("123");
//        System.out.println(plotlyManager.generateGraph(new String[]{"3", "4", "5"}));
        System.out.println(plotlyManager.generateTopFiveTransactionsGraph(new String[]{"A", "B", "C"},
                new String[]{"3", "4", "5"}));
    }

    private String userId;

    public PlotlyManager(String userId){
        this.userId = userId;
    }

    public String generateTopFiveTransactionsGraph(String[] merchantName, String[] monthlyData) throws IOException {
        String url = "https://plot.ly/clientresp";

        HttpClient client = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(url);

        List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
        urlParameters.add(new BasicNameValuePair("un", "PrayagParmar"));
        urlParameters.add(new BasicNameValuePair("key", "vrrkw445hy"));
        urlParameters.add(new BasicNameValuePair("origin", "plot"));
        urlParameters.add(new BasicNameValuePair("platform", "lisp"));
        String args = new JSONObject()
                .put("x", merchantName)
                .put("y", monthlyData).toString();

        urlParameters.add(new BasicNameValuePair("args", args));

        String kwargs = new JSONObject()
                .put("filename", "Top 5 Transactions for " + userId)
                .put("fileopt", "new")
                .put("style", new JSONObject().put("type", "bar"))

                .put("layout", new JSONObject()
                        .put("title", "Your Monthly Financial Health")
                        .put("xaxis", new JSONObject().put("name", "Merchant Name"))
                        .put("yaxis", new JSONObject().put("name", "Amount in $")))
                .put("world_readable", "true").toString();
        urlParameters.add(new BasicNameValuePair("kwargs", kwargs));

        post.setEntity(new UrlEncodedFormEntity(urlParameters));

        HttpResponse response = client.execute(post);
        System.out.println("Response Code : "
                + response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }

        return new JSONObject(result.toString()).get("url").toString();
    }

    public String generateGraph(String[] monthlyData) throws IOException {
        String url = "https://plot.ly/clientresp";

        HttpClient client = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(url);

        List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
        urlParameters.add(new BasicNameValuePair("un", "PrayagParmar"));
        urlParameters.add(new BasicNameValuePair("key", "vrrkw445hy"));
        urlParameters.add(new BasicNameValuePair("origin", "plot"));
        urlParameters.add(new BasicNameValuePair("platform", "lisp"));
        String args = new JSONObject()
                .put("x", new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"})
                .put("y", monthlyData).toString();

        urlParameters.add(new BasicNameValuePair("args", args));

        String kwargs = new JSONObject()
                .put("filename", "Monthly Financial Stats for " + userId)
                .put("fileopt", "new")
                .put("style", new JSONObject().put("type", "bar"))

                .put("layout", new JSONObject()
                        .put("title", "Your Monthly Financial Health")
                        .put("xaxis", new JSONObject().put("name", "Month"))
                        .put("yaxis", new JSONObject().put("name", "Amount in $")))
                .put("world_readable", "true").toString();
        urlParameters.add(new BasicNameValuePair("kwargs", kwargs));

        post.setEntity(new UrlEncodedFormEntity(urlParameters));

        HttpResponse response = client.execute(post);
        System.out.println("Response Code : "
                + response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }

        return new JSONObject(result.toString()).get("url").toString();
    }


}
