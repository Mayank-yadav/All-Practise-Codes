package com.yash.cc.beans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class UserServiceBean
 */
@Stateless
@LocalBean
public class UserServiceBean implements UserServiceBeanLocal {

    /**
     * Default constructor. 
     */
    public UserServiceBean() {
    	
    }
    @Override
    public double convert(String currType, String currValue) {
      double retValue = 0.0;
      Double d = new Double(currValue);
      if (currType.equals("rupees"))
        retValue = (double) 47 * d.doubleValue();
      if (currType.equals("euro"))
        retValue = (double) 42 * d.doubleValue();
      if (currType.equals("pond"))
        retValue = (double) 5 * d.doubleValue();
      if (currType.equals("yen"))
        retValue = (double) 10 * d.doubleValue();
      if (currType.equals("ruble"))
        retValue = (double) 50 * d.doubleValue();
      return retValue;
    }
}
