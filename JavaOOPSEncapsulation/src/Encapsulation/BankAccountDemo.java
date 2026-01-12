package Encapsulation;

public class BankAccountDemo {
	 public static void main(String[] args) {
		 BankAccount acc = new BankAccount();
		 acc.setAccountNumber(12345);
		 acc.setBalance(5000);
		 System.out.println("Balance: " + acc.getBalance());

}
}
