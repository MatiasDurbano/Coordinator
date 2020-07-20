package com.controller;
import java.util.ArrayList;
import java.util.List;

import com.Initializer.Initializer;
import com.Initializer.InitializerImpl;
import com.message.MessageCollector;
import com.message.MessageCollectorImpl;

public class CoordinatorController {
	
	
		
	public CoordinatorController() {}
	
	public List<String> getMessages() {
		List<String> ret = new ArrayList<String>();
		Initializer initializer = new InitializerImpl();
		MessageCollector messageCollector = new MessageCollectorImpl();
		ret = messageCollector.getMessages(initializer.getInstance());
		for(String msg : ret) {
			System.out.println(msg);
		}
		return null;
	}
}
