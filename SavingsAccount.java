/*
 * Copyright (c) 2013, OXUS20 and its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */

/**
 * A SavingsAccount is a BankAccount with an associated interest rate, interest
 * is calculated and added to the balance periodically
 * 
 * @author <a href="mailto:absherzad@gmail.com">Abdul Rahman Sherzad</a>
 * @version 1.0
 */
public class SavingsAccount extends BankAccount {
	private double interestRate;

	/**
	 * The SavingsAccount constructor is responsible creating SavingsAccount and
	 * in the meanwhile calling the BankAccount constructor to create the Bank
	 * Account with given Account Number and Account Name
	 * 
	 * @param accNumber
	 *            Bank Account# as String
	 * @param accName
	 *            Bank Account Name as String
	 * @param rate
	 *            Interest Rate as double
	 */
	public SavingsAccount(String accNumber, String accName, double rate) {
		super(accNumber, accName);
		interestRate = rate;
	}

	/**
	 * interest is calculated and added to the balance by calling the deposit()
	 * method of parent class periodically
	 */
	public void addInterest() {
		double interest = getBalance() * interestRate / 100;
		deposit(interest);
	}
}
