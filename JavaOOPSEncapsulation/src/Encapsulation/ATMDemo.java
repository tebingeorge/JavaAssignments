package Encapsulation;

public class ATMDemo {
	public static void main(String[] args) {
		 ATMAccount acc = new ATMAccount();
		 acc.setPin(1234);
		 acc.setBalance(5000);
		 
		 acc.withdraw(2000);


}
}