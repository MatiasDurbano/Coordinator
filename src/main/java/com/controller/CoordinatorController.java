package com.controller;
import java.util.ArrayList;
import java.util.List;

import com.collector.MessagesCollector;
import com.collector.MessagesCollectorImpl;
import com.initializer.Initializer;
import com.initializer.InitializerImpl;

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
