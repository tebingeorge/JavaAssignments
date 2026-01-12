
public class SwapTemprory {
	public static void main(String[] args) {
        int a = 5, b = 10, temp=0;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

