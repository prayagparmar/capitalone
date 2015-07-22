package com.capitalone.hack.util;

/**
 * User: prayagparmar
 * Date: 3/7/15
 * Time: 11:40 AM
 */
public class User {
    private String mobileNumber, userId, password, authToken, apiToken;

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    @Override
    public String toString() {
        return "User{" +
                "mobileNumber='" + mobileNumber + '\'' +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", authToken='" + authToken + '\'' +
                ", apiToken='" + apiToken + '\'' +
                '}';
    }
}
