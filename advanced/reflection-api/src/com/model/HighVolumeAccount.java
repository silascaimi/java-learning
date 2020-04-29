package com.model;

public final class HighVolumeAccount extends BankAccount implements Runnable {

	public HighVolumeAccount(String id) {
		super(id);
	}

	public HighVolumeAccount(String id, double balance) {
		super(id, balance);
	}

	private double[] readDailyDeposits() {
		return null;
	}

	private double[] readDailyWithdralwals() {
		return null;
	}

	@Override
	public void run() {

		for (double depositAmt : readDailyDeposits()) {
			deposit(depositAmt);
		}

		for (double withdralwalAmt : readDailyWithdralwals()) {
			withdrawal(withdralwalAmt);
		}

	}

}
