# Java Bank Accounts Simulator using Object Oriented Programming
The Bank Account Simulation example covers most Object Oriented Programming features i.e. Class, Object, Inheritance, Polymorphism, Encapsulation, etc.

## BankAccount Blueprint and Template
*. ** State / Attributes**
``* accountName
``* accountNumber
``* balance
*. ** Behaviors / Methods
``* BankAccount(String accNumber, String accName)
``* getAccountName()
``* getAccountNumber()
``* getBalance() 
``* deposit(double amount)
``* withdraw(double amount)

### BankAccount Demo
Following BankAccountDemo.java demonstrates the use of BankAccount.java
 ```java
 public class BankAccountDemo {

	public static void main(String[] args) {
		BankAccount absherzad = new BankAccount("20120", "Abdul Rahman Sherzad");

		absherzad.deposit(500);
		absherzad.deposit(1500);

		System.out.println("Balance is: " + absherzad.getBalance()); // 2000

		absherzad.withdraw(400);

		System.out.println("Balance is: " + absherzad.getBalance()); // 1600
	}
 }
 ```
 
## SavingsAccount Blueprint and Template
1. ** State / Attributes**
``* interestRate
``* accountName		// _inherited from BankAccount_
``* accountNumber	// _inherited from BankAccount_
``* balance			// _inherited from BankAccount_
2. ** Behaviors / Methods
``* SavingsAccount(String accNumber, String accName, double rate)
``* addInterest()
``* BankAccount(String accNumber, String accName) // _inherited from BankAccount_
``* getAccountName()		// _inherited from BankAccount_
``* getAccountNumber()		// _inherited from BankAccount_
``* getBalance() 			// _inherited from BankAccount_
``* deposit(double amount)	// _inherited from BankAccount_
``* withdraw(double amount)	// _inherited from BankAccount_

### SavingsAccount Demo
Following SavingsAccountDemo.java demonstrates the use of SavingsAccount.java
 ```java
 public class SavingsAccountDemo {

	public static void main(String[] args) {
		SavingsAccount saving = new SavingsAccount("20120",
				"Abdul Rahman Sherzad", 10);
		saving.deposit(500);
		System.out.println("Balance Before Interest: " + saving.getBalance());

		saving.addInterest();
		System.out.println("Balance After Interest: " + saving.getBalance());
	}
 }
 ```
  
## CheckingAccount Blueprint and Template
1. ** State / Attributes**
``* transactionCount
``* NUM_FREE
``* TRANS_FEE
``* accountName		// _inherited from BankAccount_
``* accountNumber	// _inherited from BankAccount_
``* balance			// _inherited from BankAccount_
2. ** Behaviors / Methods
``* CheckingAccount(String accNumber, String accName)
``* BankAccount(String accNumber, String accName) // _inherited from BankAccount_
``* getAccountName()		// _inherited from BankAccount_
``* getAccountNumber()		// _inherited from BankAccount_
``* getBalance() 			// _inherited from BankAccount_
``* deductFees()
``* deposit(double amount)	// _Overridden_
``* withdraw(double amount)	// _Overridden_
``* deposit(double amount)	// _inherited from BankAccount_
``* withdraw(double amount)	// _inherited from BankAccount_

### CheckingAccount Demo
Following CheckingAccountDemo.java demonstrates the use of CheckingAccount.java
 ```java
 public class CheckingAccountDemo {
	public static void main(String[] args) {
		CheckingAccount checking = new CheckingAccount("20120",
				"Abdul Rahman Sherzad");

		checking.deposit(500);
		checking.withdraw(200);
		checking.deposit(700);
		// No deduction fee because we had only 3 transactions
		checking.deductFees();
		System.out.println("transactions <= 3: " + checking.getBalance());

		// One more transaction
		checking.deposit(200);
		// Deduction fee occurs because we have had 4 transactions
		checking.deductFees();
		System.out.println("transactions > 3: " + checking.getBalance());
	}
 }
 ```

[Presentation on Slide Share website](http://www.slideshare.net/absherzad/everything-about-object-oriented-programming)
 
[Follow us on Facebook](https://www.facebook.com/Oxus20)