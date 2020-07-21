package com.controller;
import java.util.ArrayList;
import java.util.List;

import com.Initializer.Initializer;
import com.Initializer.InitializerImpl;
import com.message.MessagesCollector;
import com.message.MessagesCollectorImpl;

public class CoordinatorController {
	
	private Initializer initializer ;
	private MessagesCollector messageCollector;
	
	public CoordinatorController() {
		this.initializer	= new InitializerImpl();
		this.messageCollector = new MessagesCollectorImpl();
		
	}
	
	public List<String> getMessages() {
		List<String> ret = new ArrayList<String>();
		ret = this.messageCollector.getMessages(this.initializer.getInstance());
		return ret;
	}
}
