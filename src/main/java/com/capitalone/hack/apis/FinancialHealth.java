package com.capitalone.hack.apis;

import com.capitalone.hack.util.XigniteWrapper;
import com.capitalone.hack.wrapper.Accounts;
import com.capitalone.hack.wrapper.Transaction;
import com.capitalone.hack.wrapper.Transactions;
import com.capitalone.hack.wrapper.capitalone.CapitalOneApiWrapper;

import java.io.IOException;
import java.util.*;

public class FinancialHealth {
    public static final HashMap<String, String> numberToMonth = new HashMap<String, String>();
    public static final HashMap<String, Integer> monthTonumber = new HashMap<String, Integer>();
    CapitalOneApiWrapper capitalOneApiWrapper;
    XigniteWrapper xigniteWrapper = new XigniteWrapper();

    public FinancialHealth(String userId, String authToken, String apiToken) {
        numberToMonth.put("01", "Jan");
        numberToMonth.put("02", "Feb");
        numberToMonth.put("03", "Mar");
        numberToMonth.put("04", "Apr");
        numberToMonth.put("05", "May");
        numberToMonth.put("06", "Jun");
        numberToMonth.put("07", "Jul");
        numberToMonth.put("08", "Aug");
        numberToMonth.put("09", "Sep");
        numberToMonth.put("10", "Oct");
        numberToMonth.put("11", "Nov");
        numberToMonth.put("12", "Dec");

        monthTonumber.put("Jan", 0);
        monthTonumber.put("Feb", 1);
        monthTonumber.put("Mar", 2);
        monthTonumber.put("Apr", 3);
        monthTonumber.put("May", 4);
        monthTonumber.put("Jun", 5);
        monthTonumber.put("Jul", 6);
        monthTonumber.put("Aug", 7);
        monthTonumber.put("Sep", 8);
        monthTonumber.put("Oct", 9);
        monthTonumber.put("Nov", 10);
        monthTonumber.put("Dec", 11);

        capitalOneApiWrapper = new CapitalOneApiWrapper(userId, authToken, apiToken);
    }


    public String[] getMonthlyBalanceArray() {
        String[] csvMonthlyBalance = new String[12];

        Map<String, String> monthWiseDistribution = new HashMap<String, String>();
        try {
            Accounts accounts = capitalOneApiWrapper.getAccounts();

            Transactions transactions = capitalOneApiWrapper.getAlltransactions();

            //Map<String,String> creditMonthWiseDistribution = new HashMap<String,String>();
            for (Transaction transaction : transactions.getTransactions()) {
                String monthNum = transaction.getTransactionTime().split("-")[1];
                String month = numberToMonth.get(monthNum);
                String amount = "" + transaction.getAmount();
                String tmpAmount = monthWiseDistribution.get(month);
                if (tmpAmount == null)
                    monthWiseDistribution.put(month, amount);
                else {
                    tmpAmount = "" + Double.valueOf("" + (Double.parseDouble(tmpAmount) + Double.parseDouble(amount))).longValue();

                    monthWiseDistribution.put(month, tmpAmount);
                }


            }


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        printMap(monthWiseDistribution);
        csvMonthlyBalance = convertToCSV(monthWiseDistribution);
        return csvMonthlyBalance;
    }

    private void printMap(Map<String, String> monthWiseDistribution) {
        Iterator itr = monthWiseDistribution.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println("Key==" + entry.getKey() + "Value==" + entry.getValue());

        }

    }

    private String[] convertToCSV(Map<String, String> monthWiseDistribution) {
        // TODO Auto-generated method stub
        String[] csvMonthlyBalance = new String[12];
        for (int i = 0; i < 12; i++) {
            csvMonthlyBalance[i] = " ";
        }
        Iterator itr = monthWiseDistribution.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            csvMonthlyBalance[monthTonumber.get(entry.getKey())] = ""+(Integer.parseInt((String) entry.getValue())/10000);

        }
        return csvMonthlyBalance;
    }

    public String[] getTopFiveMerchantsSuckingYourMoney() {


        Map<String, Integer> topExpenses = getTopFiveExpenditures();

        String[] topMerchants = new String[topExpenses.size()];

        Iterator itr = topExpenses.entrySet().iterator();

        int size = 0;

        while (itr.hasNext()) {

            topMerchants[size++] = ((Map.Entry<String, Integer>) itr.next()).getKey();

        }

        return topMerchants;

    }

    public String[] getTopFiveAmountsSuckedByMerchant() {


        Map<String, Integer> topExpenses = getTopFiveExpenditures();

        String[] topAmounts = new String[topExpenses.size()];

        Iterator itr = topExpenses.entrySet().iterator();

        int size = 0;

        while (itr.hasNext()) {

            topAmounts[size++] = "" + ((Map.Entry<String, Integer>) itr.next()).getValue();

        }

        return topAmounts;

    }

    public Map<String, Integer> getTopFiveExpenditures() {

        Map<String, Integer> expendituresGreaterThanAvg = new HashMap<String, Integer>();

        Map<String, Integer> topmostExpenses = new LinkedHashMap<String, Integer>();

        Double avgExp = 0.0;

        try {

            avgExp = findAverageExpenditurePerTransaction();

            System.out.println("Average Expenditure == " + avgExp);

        } catch (Exception e1) {

// TODO Auto-generated catch block

            e1.printStackTrace();

        }

        try {

            Transactions transactions = capitalOneApiWrapper.getAlltransactions();


            for (Transaction transaction : transactions.getTransactions()) {

                String merchant = transaction.getMerchant();

                if (transaction.getAmount() < 0 && !(merchant.toLowerCase().contains("check") || merchant.toLowerCase().contains("card") || merchant.toLowerCase().contains("payment")) && Math.abs(transaction.getAmount()) > avgExp) {

//String  merchant = transaction.getMerchant();

                    Integer amount = expendituresGreaterThanAvg.get(merchant);

                    if (amount == null)

                        expendituresGreaterThanAvg.put(merchant, Math.abs(transaction.getAmount()/10000));

                    else

                        expendituresGreaterThanAvg.put(merchant, Math.abs(amount + transaction.getAmount()/10000));

                }

            }

            List<Map.Entry<String, Integer>> entries = entriesSortedByValues(expendituresGreaterThanAvg);


            if (entries.size() > 5) {

                for (int i = 0; i < 5; i++) {

                    topmostExpenses.put(entries.get(i).getKey(), entries.get(i).getValue());

                }

            } else {

                for (int i = 0; i < entries.size(); i++) {

                    topmostExpenses.put(entries.get(i).getKey(), entries.get(i).getValue());

                }

            }


        } catch (Exception e) {

// TODO Auto-generated catch block

            e.printStackTrace();

        }

        return topmostExpenses;

    }

    List<Map.Entry<String, Integer>> entriesSortedByValues(Map<String, Integer> map) {


        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());


        Collections.sort(sortedEntries,

                new Comparator<Map.Entry<String, Integer>>() {

                    @Override

                    public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {

                        return e2.getValue().compareTo(e1.getValue());

                    }

                }

        );


        return sortedEntries;

    }

    private Double findAverageExpenditurePerTransaction() throws Exception {

        Transactions transactions = capitalOneApiWrapper.getAlltransactions();


        Double totalExpenditure = 0.0;

        for (Transaction transaction : transactions.getTransactions()) {

            int amount = transaction.getAmount();

            String merchant = transaction.getMerchant();

            if (amount < 0 && !(merchant.toLowerCase().contains("check") || merchant.toLowerCase().contains("card") || merchant.toLowerCase().contains("payment")))

                totalExpenditure = totalExpenditure + Math.abs(amount);

        }

        System.out.println("totalExpenditure===" + totalExpenditure + "size" + transactions.getTransactions().size());

        int sizeOfExpenditure = 0;

        for (Transaction transaction : transactions.getTransactions())

            if (transaction.getAmount() < 0)

                sizeOfExpenditure++;

        return totalExpenditure / sizeOfExpenditure;

    }


    public String getSuggestionForWellToDoUser() throws IOException {
        StringBuilder message = new StringBuilder();
        Map<String, String> monthWiseDistribution = getMonthWiseDistribution();
        Iterator itr = monthWiseDistribution.entrySet().iterator();
        Integer totalSum =0 ;
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            if(Integer.parseInt(""+entry.getValue()) > 0) {
                totalSum += totalSum + (Integer.parseInt("" + entry.getValue()) / 10000);
            }

        }

        //XigniteGlobalIndices indices = xigniteWrapper.getIndexByName("Dow%20Jones%20Indices");

        message.append("Your Total surplus balance is :"+totalSum);
        message.append("Invest in DJSAFE.IND_DJI and its value currently is "+ xigniteWrapper.getIndexValue("DJSAFE.IND_DJI").getValue().getOpen());
        return message.toString();
    }

    private Map<String, String> getMonthWiseDistribution() {
        Map<String, String> monthWiseDistribution = new HashMap<String, String>();
        try {
            Accounts accounts = capitalOneApiWrapper.getAccounts();

            Transactions transactions = capitalOneApiWrapper.getAlltransactions();

            //Map<String,String> creditMonthWiseDistribution = new HashMap<String,String>();
            for (Transaction transaction : transactions.getTransactions()) {
                String monthNum = transaction.getTransactionTime().split("-")[1];
                String month = numberToMonth.get(monthNum);
                String amount = "" + transaction.getAmount();
                String tmpAmount = monthWiseDistribution.get(month);
                if (tmpAmount == null)
                    monthWiseDistribution.put(month, amount);
                else {
                    tmpAmount = "" + Double.valueOf("" + (Double.parseDouble(tmpAmount) + Double.parseDouble(amount))).longValue();

                    monthWiseDistribution.put(month, tmpAmount);
                }


            }


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return monthWiseDistribution;
    }
}
