package com.capitalone.hack.wrapper.Nexmo;

import com.capitalone.hack.wrapper.httpclient.HttpClient;

public class NexmoWrapper {
    HttpClient httpClient = new HttpClient();

    public String send(String mobileNumber, String message) {
        try {
            httpClient.sendPostNexmo(mobileNumber, message);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return message;

    }
}
