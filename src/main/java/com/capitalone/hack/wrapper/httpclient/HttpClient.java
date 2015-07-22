package com.capitalone.hack.wrapper.httpclient;

import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class HttpClient {



	// HTTP GET request
		public String sendPostNexmo(String MobileNumber, String message) throws Exception {
            message = message.replace(" ", "+");
			StringBuilder url = new StringBuilder("https://rest.nexmo.com/sms/json?api_key=5dd3775c&api_secret=ef2cad93&from=12529178628&to=");
			url.append(MobileNumber);
			url.append("&text=");
			url.append(message);
			System.out.println("URL is "+url);
			Content content = Request.Post(url.toString()).execute().returnContent();
//			System.out.println("Response Code : " +
//                    content.asString());
			return content.asString();
		}
	 
		// HTTP POST request
		public String sendPostCO(String url, String rawParams) throws Exception {
	 
			
	 
			//CloseableHttpClient httpclient = HttpClients.createDefault();
		

			
			Content content = Request.Post(url).addHeader("Content-Type","application/json")
			.addHeader("Accept","application/json").bodyByteArray(rawParams.getBytes()).execute().returnContent();

			System.out.println("\nSending 'POST' request to URL : " + url);
			//System.out.println("Post parameters : " + post.getEntity());
//			System.out.println("Response Code : " +
//	                                    content.asString());
//
			BufferedReader rd = new BufferedReader(
	                        new InputStreamReader(content.asStream()));
	 
			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
	 
			System.out.println(result.toString());
			return result.toString();
	 
		}

    public String sendGetXignite(String url) throws IOException {

        Content content = Request.Get(url).addHeader("Accept","application/json").execute().returnContent();
        //System.out.println("Response Code : " +
        //    content.asString());
        return     content.asString();
    }
	 
}
