package oops;
public class BankAccount {
 int accountNumber;
 String holderName;
 double balance;
 BankAccount(int a, String h, double b) {
 accountNumber = a;
 holderName = h;
 balance = b;
 }
 void showAccount() {
 System.out.println(accountNumber + " " + holderName + " " + balance);
 }
 public static void main(String[] args) {
 BankAccount acc = new BankAccount(123, "Ravi", 5000);
 acc.showAccount();
 }
}
