package reverseString;

public class ReverseWord {
    public static void main(String[] args) {
        String sentence = "Hello every one";
        String reversesentence = reverse(sentence); // Capture the result of reverse method
        System.out.println("Original: " + sentence);
        System.out.println("Reversed: " + reversesentence);
    }
    public static String reverse(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();


        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }


        return reversedSentence.toString().trim();
    }


    }



