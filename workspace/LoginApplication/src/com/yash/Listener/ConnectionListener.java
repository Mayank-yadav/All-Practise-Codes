package com.yash.Listener;

import java.io.FileReader;
import java.sql.DriverManager;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import java.sql.*;
import java.util.Properties;


@WebListener
public class ConnectionListener implements ServletContextListener {

@Override
public void contextDestroyed(ServletContextEvent contextEvent) {
 
}

@Override
public void contextInitialized(ServletContextEvent contextEvent) {
 
ServletContext context=contextEvent.getServletContext();
String driver=context.getInitParameter("driver");
String url=context.getInitParameter("url");
String user=context.getInitParameter("user");
String password=context.getInitParameter("password");
String filepath=context.getInitParameter("filepath");
 
try {
Class.forName(driver);
Connection connection=DriverManager.getConnection(url,user,password);
      FileReader fileReader=new  FileReader(filepath);
      Properties properties=new Properties();
      properties.load(fileReader);
      /*
      context.setAttribute("value2", properties.getProperty("title"));
      context.setAttribute("value2", properties.getProperty("customerId"));
      context.setAttribute("value3",properties.getProperty("customerPassword"));*/
     
      context.setAttribute("properties", properties);
      context.setAttribute("connection", connection);
 
} catch (Exception e) {
 
e.printStackTrace();
}
}

 
 
}