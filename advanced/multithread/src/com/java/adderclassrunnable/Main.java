package com.java.adderclassrunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		String[] inFiles = { "infile1.txt" };
		String[] outFiles = { "outfile1.txt" };

//		Thread[] threads = new Thread[inFiles.length];
//		for (int i = 0; i < inFiles.length; i++) {
//			Adder adder = new Adder(inFiles[i], outFiles[i]);
//			threads[i] = new Thread(adder);
//			threads[i].start();
//		}
//		for (Thread thread : threads) {
//			thread.join();
//		}

		// Usando thread pools
		ExecutorService es = Executors.newFixedThreadPool(3);
		for (int i = 0; i < inFiles.length; i++) {
			Adder adder = new Adder(inFiles[i], outFiles[i]);
			es.submit(adder);
		}
		try {
			es.shutdown();
			es.awaitTermination(60, TimeUnit.SECONDS);
		} catch (Exception e) {
			
		}
	}

}
