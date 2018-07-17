package com.threadComm;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadTestDemo {
	
	public static void main(String[] args) throws Exception{
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		List<CallableDemo> list = new ArrayList<>();
		
		for(int i = 1; i <= 30; i++) {
			CallableDemo test =  new CallableDemo(i);
			list.add(test);
		}
		
		List<Future<String>> results = executor.invokeAll(list);
		
		for(Future<String> future : results) {
			System.out.println(future.get());
		}
		
		executor.shutdown();
	}
}
