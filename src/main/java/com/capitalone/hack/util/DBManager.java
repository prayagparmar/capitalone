package com.capitalone.hack.util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * User: prayagparmar
 * Date: 3/7/15
 * Time: 10:09 AM
 */
public class DBManager {
    // JDBC driver name and database URL
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/hackathon";

    //  Database credentials
    private static final String USER = "pparmar";
    private static final String PASS = "sanfrancisco";

    static {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args){
//        DBManager dbManager = new DBManager();
//
//        User user = new User();
//        user.setMobileNumber("4088934712");
//        user.setUserId("1110568334");
//        user.setPassword("");
//        user.setApiToken("HackathonApiToken");
//        user.setAuthToken("4CC6E59631F76B2F4CCAB80EEEAC159F");
//
//        dbManager.insert(user);
//
//        for(User fetchedUser : dbManager.fetch()){
//            System.out.println(fetchedUser.toString());
//        }
//    }

    public void insert(User user) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String insertTableSQL = "INSERT INTO capital_one VALUES(?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertTableSQL);
            preparedStatement.setString(1, user.getMobileNumber());
            preparedStatement.setString(2, user.getUserId());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setString(4, user.getAuthToken());
            preparedStatement.setString(5, user.getApiToken());

            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null)
                    System.out.println("Disconnecting after insert");
                    connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    public List<User> fetch() {
        Connection connection = null;
        List<User> users = new ArrayList<>();
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = connection.createStatement();
            String sql = "SELECT * FROM capital_one";
            ResultSet rs = stmt.executeQuery(sql);


            while (rs.next()) {
                User user = new User();
                //Retrieve by column name
                String mobileNumber = rs.getString("mobile_number");
                String userId = rs.getString("user_id");
                String password = rs.getString("password");
                String authToken = rs.getString("auth_token");
                String apiToken = rs.getString("api_token");

                user.setMobileNumber(mobileNumber);
                user.setUserId(userId);
                user.setPassword(password);
                user.setAuthToken(authToken);
                user.setApiToken(apiToken);

                users.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null)
                    System.out.println("Disconnecting after fetch");
                    connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

        return users;
    }
}
