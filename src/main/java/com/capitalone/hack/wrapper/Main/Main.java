package com.capitalone.hack.wrapper.Main;

import com.capitalone.hack.wrapper.Nexmo.NexmoWrapper;

public class Main {

    public static void main(String[] args) {
//        CapitalOneApiWrapper capitalWrapper = new CapitalOneApiWrapper("1110570164");
        NexmoWrapper nexmoWrapper = new NexmoWrapper();
        try {
//            System.out.println(capitalWrapper.getAccounts());
//            System.out.println(capitalWrapper.getAlltransactions());
//            System.out.println(capitalWrapper.getProjectedTransactionsForMonth("2015", "3"));
//            System.out.println(capitalWrapper.getRecentHistoricalAndProjectedBalances());
//            System.out.println(capitalWrapper.findSimilarTransactions("1425687000000"));
            System.out.println(nexmoWrapper.send("16318893142", "Hello+From+code"));
//            FinancialHealth finHealth = new FinancialHealth();
//            String[] monthlyFinHealth = finHealth.getMonthlyBalanceArray("1110570164");
//            for (String s : monthlyFinHealth)
//                System.out.println(s);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
