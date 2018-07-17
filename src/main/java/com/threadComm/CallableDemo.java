package com.threadComm;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<String>{
	private int num;
	
	public CallableDemo(int num) {
		this.num = num;
	}
	
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		String name = "Thread-" + num;
		System.out.println(name + "  run");
		Thread.sleep(5*1000);
		return name;
	}
	
}
