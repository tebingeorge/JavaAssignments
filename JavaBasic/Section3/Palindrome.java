package Section3;
import java.util.Scanner;
public class Palindrome {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int num = n;
        int rev = 0;

        while (num > 0) {
            temp = num % 10;
            rev = rev * 10 + temp;
            num = num / 10;
            
        }

        if (rev == n)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome");
    }

}
