package Inheritance;

public class Car extends Vehicle {
	 String brand;
	 public static void main(String[] args) {
	 Car c = new Car();
	 c.speed = 120;
	 c.brand = "Honda";
	 System.out.println("Speed: " + c.speed);
	 System.out.println("Brand: " + c.brand);
	 }
}