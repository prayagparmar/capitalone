package com.capitalone.hack;

import com.capitalone.hack.core.SmartLogic;
import com.capitalone.hack.util.DBManager;
import com.capitalone.hack.util.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * User: prayagparmar
 * Date: 3/7/15
 * Time: 10:09 AM
 */
public class MainServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static DBManager dbManager;

    static {
        dbManager = new DBManager();
        SmartLogic smartLogic = new SmartLogic();
        smartLogic.startSmartLogic();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setMobileNumber(request.getHeader("mobileNumber"));
        user.setUserId(request.getHeader("userId"));
        user.setPassword(request.getHeader("password"));
        user.setAuthToken(request.getHeader("authToken"));
        user.setApiToken(request.getHeader("apiToken"));
        if(user.getUserId() != null){
            dbManager.insert(user);
        }
        response.getOutputStream().write("Hello World".getBytes());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}