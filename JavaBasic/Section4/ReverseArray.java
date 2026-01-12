package Section4;
import java.util.Scanner;

public class ReverseArray {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int a[]  = new int[5];

	        System.out.println("Enter 5 elements:");
	        for (int i = 0; i < 5; i++) {
	            a[i] = sc.nextInt();
	        }

	        System.out.println("Reversed array:");
	        for (int i = 4; i >= 0; i--) {
	            System.out.print(a[i] + " ");
	        }
	    }

}
