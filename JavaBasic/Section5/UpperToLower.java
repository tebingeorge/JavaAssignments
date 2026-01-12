package Section5;

public class UpperToLower {
	public static void main(String[] args) {

        String str = "JAVA";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result = result + (char)(ch + 32);
        }

        System.out.println("Lowercase: " + result);
    }

}
