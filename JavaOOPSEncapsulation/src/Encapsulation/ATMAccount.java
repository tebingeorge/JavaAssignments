package Encapsulation;

public class ATMAccount {
	private int pin;
	 private double balance;
	 public void setPin(int pin) {
	 if(String.valueOf(pin).length() == 4)
	 this.pin = pin;
	 }
	 public void setBalance(double balance) {
	 this.balance = balance;
	 }
	 public void withdraw(double amount) {
	 if(amount <= balance) {
	 balance -= amount;
	 System.out.println("Withdrawal successful");
	 } else {
	 System.out.println("Insufficient balance");
	 }
	 }

}
