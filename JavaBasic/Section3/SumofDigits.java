package Section3;
import java.util.Scanner;

class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int num=n;

        int sum = 0;
        while (n != 0) {
        	num= n % 10;
            sum = sum + num;
            n = n / 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}
