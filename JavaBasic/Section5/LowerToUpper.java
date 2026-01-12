package Section5;

public class LowerToUpper {
	 public static void main(String[] args) {

	        String str = "java";
	        String result = "";

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            result = result + (char)(ch - 32);
	        }

	        System.out.println("Uppercase: " + result);
	    }

}
