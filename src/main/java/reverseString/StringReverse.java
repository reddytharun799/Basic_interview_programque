package reverseString;

public class StringReverse {
    public static void main(String[] args) {
        String str="reverse";
        String rstr="";
        for (int i= str.length() - 1; i>=0 ; i--) {
            rstr += str.charAt(i);
            System.out.println(rstr);
        }

    }
}
