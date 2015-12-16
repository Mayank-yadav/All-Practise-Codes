package com.yash.listeners;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class MyLoginListner implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent Event) {
		// TODO Auto-generated method stub
		String path=Event.getServletContext().getInitParameter("File");
		String url=Event.getServletContext().getRealPath(path);
		try {
			FileReader reader=new FileReader(url);
			java.util.Properties properties=new java.util.Properties();
			try {
				properties.load(reader);
				ServletContext context=Event.getServletContext();
				context.setAttribute("properties", properties);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
