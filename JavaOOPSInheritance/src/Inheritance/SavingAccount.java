package Inheritance;

public class SavingAccount extends Bank {
	 double calculateInterest(double amount) {
	 return (amount * interestRate) / 100;
	 }
	 public static void main(String[] args) {
	 SavingAccount sa = new SavingAccount();
	 System.out.println("Interest: " + sa.calculateInterest(10000));
	 }
	}
