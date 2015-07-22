package com.capitalone.hack.core;

import com.capitalone.hack.apis.FinancialHealth;
import com.capitalone.hack.util.DBManager;
import com.capitalone.hack.util.PlotlyManager;
import com.capitalone.hack.util.User;
import com.capitalone.hack.wrapper.Nexmo.NexmoWrapper;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * User: prayagparmar
 * Date: 3/7/15
 * Time: 12:40 PM
 */
public class SmartLogic {
    public void startSmartLogic(){
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(new BasicCreditCheckThread(), 0, 2, TimeUnit.MINUTES);
    }

//    public static void main(String[] args){
//        SmartLogic smartLogic = new SmartLogic();
//        smartLogic.startSmartLogic();
//    }

    public class BasicCreditCheckThread implements Runnable {
        DBManager dbManager;

        public BasicCreditCheckThread() {
            dbManager = new DBManager();
        }

        @Override
        public void run() {
            System.out.println("Basic Thread");
            for(User dbUser : dbManager.fetch()){
                System.out.println(dbUser.toString());
                FinancialHealth financialHealth = new FinancialHealth(dbUser.getUserId(), dbUser.getAuthToken(), dbUser.getApiToken());
                PlotlyManager plotlyManager = new PlotlyManager(dbUser.getUserId());
                try {
                    NexmoWrapper nexmoWrapper = new NexmoWrapper();
                    String urlFinancialHealth = plotlyManager.generateGraph(financialHealth.getMonthlyBalanceArray());
                    String urlTopFiveTransaction = plotlyManager.generateTopFiveTransactionsGraph(
                            financialHealth.getTopFiveMerchantsSuckingYourMoney(),
                            financialHealth.getTopFiveAmountsSuckedByMerchant());
                    nexmoWrapper.send(dbUser.getMobileNumber(), "Your Yearly Financial Summary: " + urlFinancialHealth);
                    if(dbUser.getUserId().equals("1110570164")){
                        nexmoWrapper.send(dbUser.getMobileNumber(), "Suggestion: " + financialHealth.getSuggestionForWellToDoUser());
                    }else{
                        nexmoWrapper.send(dbUser.getMobileNumber(), "Your Top Five Expenses Last Month: " + urlTopFiveTransaction);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
