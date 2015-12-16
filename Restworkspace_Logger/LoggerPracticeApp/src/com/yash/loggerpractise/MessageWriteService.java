package com.yash.loggerpractise;

import java.util.logging.Logger;

public class MessageWriteService {

	static final Logger LOGGER=Logger.getLogger(MessageWriteService.class.getName());
	public void writeMessage(){
		LOGGER.info("write Message method");
		
	}
}
