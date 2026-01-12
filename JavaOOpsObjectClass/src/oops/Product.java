package oops;
public class Product {
 int productId;
 String productName;
 double price;
 Product(int productId, String productName, double price) {
 this.productId = productId;
 this.productName = productName;
 this.price = price;
 }
 void display() {
 System.out.println(productId + " " + productName + " " + price);
 }
 public static void main(String[] args) {
 Product p = new Product(1, "Laptop", 60000);
 p.display();
 }
}
