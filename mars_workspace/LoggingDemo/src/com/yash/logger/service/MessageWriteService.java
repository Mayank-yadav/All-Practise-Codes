package com.yash.logger.service;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class MessageWriteService {

	static final Logger LOGGER=Logger.getLogger(MessageWriteService.class.getName());
	
	public void writeMessage(){
		LOGGER.info("write Message Method");
		LOGGER.setLevel(Level.INFO);
		
	}
}
