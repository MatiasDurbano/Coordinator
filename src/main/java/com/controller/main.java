package com.controller;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ret = new ArrayList<String>();
		CoordinatorController coordinator = new CoordinatorController();
		ret=coordinator.getMessages();
		for(String msg : ret) {
			System.out.println(msg);
		}
		System.out.println("done");
	}

}
