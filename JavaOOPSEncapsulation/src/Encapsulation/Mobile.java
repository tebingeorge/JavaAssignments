package Encapsulation;

public class Mobile {
	private String brand;
	 private double price;
	 public void setBrand(String brand) {
	 this.brand = brand;
	 }
	 public void setPrice(double price) {
	 this.price = price;
	 }
	 public double getPriceWithGST() {
	 return price + (price * 0.18);
	 }

}
