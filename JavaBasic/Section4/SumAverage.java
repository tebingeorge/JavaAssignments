package Section4;
import java.util.Scanner;
public class SumAverage {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int[] a = new int[5];
	        int sum = 0;

	        System.out.println("Enter 5 elements:");
	        for (int i = 0; i < 5; i++) {
	            a[i] = sc.nextInt();
	            sum += a[i];
	        }

	        double avg = sum / 5.0;

	        System.out.println("Sum = " + sum);
	        System.out.println("Average = " + avg);
	    }

}
