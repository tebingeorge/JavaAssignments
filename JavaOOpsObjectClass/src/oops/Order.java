package oops;
public class Order {
 int orderId;
 String customerName;
 double amount;
 Order(int id, String name, double amt) {
 orderId = id;
 customerName = name;
 amount = amt + (amt * 0.18);
 }
 void display() {
 System.out.println(orderId + " " + customerName + " " + amount);
 }
 public static void main(String[] args) {
 Order o = new Order(1, "Amit", 1000);
 o.display();
 }
}