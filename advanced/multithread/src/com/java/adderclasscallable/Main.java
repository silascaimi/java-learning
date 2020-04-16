package com.java.adderclasscallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		String[] inFiles = { "infile1.txt" };
		
		ExecutorService es = Executors.newFixedThreadPool(3);
		Future<Integer>[] results = new Future[inFiles.length];
		
		for (int i = 0; i < inFiles.length; i++) {
			Adder adder = new Adder(inFiles[i]);
			results[i] = es.submit(adder);
		}
		
		for (Future<Integer> result : results) {
			int value = result.get();
			System.out.println("Total " + value);
		}

	}

}
