package com.capitalone.hack.wrapper.capitalone;

import com.capitalone.hack.wrapper.Accounts;
import com.capitalone.hack.wrapper.Balances;
import com.capitalone.hack.wrapper.TransactionIDs;
import com.capitalone.hack.wrapper.Transactions;
import com.capitalone.hack.wrapper.httpclient.HttpClient;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CapitalOneApiWrapper {

    private static String userId = "1110570164";
    private static String authToken = "119947F2D985C3788998543A3D3AD90C";
    private static String apitoken = "HackathonApiToken";

    public CapitalOneApiWrapper(String userId, String authToken, String apitoken) {
        this.userId = userId;
        this.authToken = authToken;
        this.apitoken = apitoken;
    }

    HttpClient client = new HttpClient();
    String rawParams = "{\"args\": {\"uid\":" + userId + ", \"token\": \"" + authToken + "\", \"api-token\": \"" + apitoken + "\"}}\"";
    String capitalOneURL = "";
    //JsonToJavaConverter converter = new JsonToJavaConverter();
    ObjectMapper mapper = new ObjectMapper();

    public Accounts getAccounts() throws Exception {
        String capitalOneURL = "https://api.levelmoney.com/api/v2/hackathon/get-accounts";
        String jsonAccounts = client.sendPostCO(capitalOneURL, rawParams);
        Accounts accounts = mapper.readValue(jsonAccounts, Accounts.class);
        return accounts;

    }

    public Transactions getAlltransactions() throws Exception {
        String capitalOneURL = "https://api.levelmoney.com/api/v2/hackathon/get-all-transactions";
        String jsonTransactions = client.sendPostCO(capitalOneURL, rawParams);
        Transactions transactions = mapper.readValue(jsonTransactions, Transactions.class);
        return transactions;
    }

    public Transactions getProjectedTransactionsForMonth(String year, String month) throws Exception {
        rawParams = "{\"args\": {\"uid\":" + userId + ", \"token\": \"" + authToken + "\", \"api-token\": \"" + apitoken + "\"},\"year\":" + year + ",\"month\":" + month + "}\"";

        String capitalOneURL = "https://api.levelmoney.com/api/v2/hackathon/projected-transactions-for-month";

        String getProjectedTransactions = client.sendPostCO(capitalOneURL, rawParams);
        Transactions transactions = mapper.readValue(getProjectedTransactions, Transactions.class);
        return transactions;
    }

    public String getRecentHistoricalAndProjectedBalances() throws Exception {
        String capitalOneURL = "https://api.levelmoney.com/api/v2/hackathon/balances";
        String getRecentBalances = client.sendPostCO(capitalOneURL, rawParams);
        Balances balances = mapper.readValue(getRecentBalances, Balances.class);
        return balances.toString();
    }

    public String findSimilarTransactions(String transactionID) throws Exception {
        String capitalOneURL = "https://api.levelmoney.com/api/v2/hackathon/find-similar-transactions";
        rawParams = "{\"args\": {\"uid\":" + userId + ", \"token\": \"" + authToken + "\", \"api-token\": \"" + apitoken + "\"},\"transaction-ids\":\"" + transactionID + "\"}\"";
        System.out.println("params Send" + rawParams);
        String jsonTransactions = client.sendPostCO(capitalOneURL, rawParams);
        TransactionIDs transactions = mapper.readValue(jsonTransactions, TransactionIDs.class);
        return transactions.toString();
    }


}
