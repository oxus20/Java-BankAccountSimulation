/*
 * Copyright (c) 2013, OXUS20 and its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */

/**
 * BankAccount class is responsible creating default bank accounts Enable the
 * accounts owner to deposit, withdraw, check balance, etc.
 * 
 * @author <a href="mailto:absherzad@gmail.com">Abdul Rahman Sherzad</a>
 * @version 1.0
 */
public class BankAccount {
	// BankAccount attributes
	private String accountNumber;
	private String accountName;
	private double balance;

	// BankAccount methods

	/**
	 * This is the constructor responsible for account creation with initial
	 * balance 0.0
	 * 
	 * @param accNumber
	 *            Bank Account Number as String
	 * @param accName
	 *            Bank Account Name as String
	 */
	public BankAccount(String accNumber, String accName) {
		accountNumber = accNumber;
		accountName = accName;
		balance = 0;
	}

	// methods to read the attributes

	/**
	 * Returns the Account Name of the bank account object.
	 * 
	 * @return accountName
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * Returns the Account Number of the bank account object.
	 * 
	 * @return accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Returns the Balance value of the bank account object.
	 * 
	 * @return balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * This method take care of the deposit transaction Return true on success
	 * and false on failure
	 * 
	 * @param amount
	 *            the amount to be deposited
	 * @return boolean
	 */
	public boolean deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This method take care of the withdraw transaction Return true on success
	 * and false on failure
	 * 
	 * @param amount
	 *            the amount to be withdrawn
	 * @return boolean
	 */
	public boolean withdraw(double amount) {
		if (amount > balance) {
			return false;
		} else {
			balance = balance - amount;
			return true;
		}
	}
}