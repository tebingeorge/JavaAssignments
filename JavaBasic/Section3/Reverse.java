package Section3;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int num = n;
        int rev = 0;

        while (n > 0) {
            num = n % 10;
            rev = rev * 10 + num;
            n = n / 10;
           
        }

        System.out.println("Reversed number = " + rev);
    }

}
