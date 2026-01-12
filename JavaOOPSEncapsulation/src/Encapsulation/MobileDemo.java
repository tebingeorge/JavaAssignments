package Encapsulation;

public class MobileDemo {
	public static void main(String[] args) {
		 Mobile m = new Mobile();
		 m.setBrand("Samsung");
		 m.setPrice(20000);
		 System.out.println("Price with GST: " + m.getPriceWithGST());
	}

}
