/*
 * Copyright (c) 2013, OXUS20 and its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */

/**
 * A CheckingAccount is a BankAccount with some number of free transactions,
 * with a fee charged for subsequent transactions
 * 
 * 
 * @author <a href="mailto:absherzad@gmail.com">Abdul Rahman Sherzad</a>
 * @version 1.0
 */

public class CheckingAccount extends BankAccount {
	private int transactionCount;
	private static final int NUM_FREE = 3;
	private static final double TRANS_FEE = 2.0;

	/**
	 * The CheckingAccount constructor is responsible creating CheckingAccount
	 * by calling the BankAccount constructor to create the Bank Account with
	 * given Account Number and Account Name
	 * 
	 * @param accNumber
	 *            Account Number as String
	 * @param accName
	 *            Account Name as String
	 */
	public CheckingAccount(String accNumber, String accName) {
		super(accNumber, accName);
		transactionCount = 0;
	}

	/**
	 * Overridden deposit() method tracking the number of transactions
	 */
	public boolean deposit(double amount) {
		if (super.deposit(amount)) {
			transactionCount++;
			return true;
		}
		return false;
	}

	/**
	 * Overridden withdraw() method tracking the number of transactions
	 */
	public boolean withdraw(double amount) {
		if (super.withdraw(amount)) {
			transactionCount++;
			return true;
		}
		return false;
	}

	/**
	 * calculates the deduction fee with a fee charged for subsequent
	 * transactions and deduct it from the balance by calling its Parent Class
	 * withdraw() method as well as reset the transactionCount
	 */
	public void deductFees() {
		if (transactionCount > NUM_FREE) {
			double fees = TRANS_FEE * (transactionCount - NUM_FREE);
			if (super.withdraw(fees)) {
				transactionCount = 0;
			}
		}
	}
}