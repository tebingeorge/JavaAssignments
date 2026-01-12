package Section5;

public class WordCount {
	public static void main(String[] args) {

        String sentence = "Java is easy to learn";
        int count = 1;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ')
                count++;
        }

        System.out.println("Number of words: " + count);
    }

}
