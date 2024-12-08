package reverseString;

public class ReverseString {
    public static void main(String[] args) {
        String str="learn java";
        String rstr="";



        for(int i =0 ;i<str.length();i++){
            char ch=str.charAt(i);// to g
            rstr =ch+ rstr; // to reverse and add to rstr
            System.out.println(rstr);


        }



    }

}
