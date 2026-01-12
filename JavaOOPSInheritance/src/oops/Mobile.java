package oops;
public class Mobile {
 String brand;
 int ram, storage;
 double price;
 Mobile(String b, int r) {
 brand = b;
 ram = r;
 storage = 64;
 price = 15000;
 }
 Mobile(String b, int r, int s, double p) {
 brand = b;
 ram = r;
 storage = s;
 price = p;
 }
 void display() {
 System.out.println(brand + " " + ram + "GB " + storage + "GB " + price);
 }
 public static void main(String[] args) {
 Mobile m1 = new Mobile("Samsung", 4);
 Mobile m2 = new Mobile("Apple", 8, 128, 80000);
 m1.display();
 m2.display();
 }
}