package com.controller;
import java.util.ArrayList;
import java.util.List;

import com.Initializer.Initializer;
import com.Initializer.InitializerImpl;
import com.message.MessagesCollector;
import com.message.MessagesCollectorImpl;

public class CoordinatorController {
	
	
		
	public CoordinatorController() {}
	
	public List<String> getMessages() {
		List<String> ret = new ArrayList<String>();
		Initializer initializer = new InitializerImpl();
		MessagesCollector messageCollector = new MessagesCollectorImpl();
		ret = messageCollector.getMessages(initializer.getInstance());
		return ret;
	}
}
