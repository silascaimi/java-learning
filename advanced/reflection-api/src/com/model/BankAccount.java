package com.model;

public class BankAccount {

	private String id;
	private double balance;
	
	public BankAccount(String id) {
		this.id = id;
	}

	public BankAccount(String id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdrawal(double amount) {
		this.balance -= amount;
	}
	
}
