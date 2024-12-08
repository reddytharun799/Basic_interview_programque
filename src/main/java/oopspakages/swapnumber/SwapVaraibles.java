package oopspakages.swapnumber;

public class SwapVaraibles {
    public static void main(String[] args) {
        String name1="Arun";
        String name2="kiran";
        int a=10,b=20;

        System.out.println("Before swapping" +name1 +"  " + " " +name2);
        //logic 1 to swapping(by using three variable)
        String temp=name1;
        name1=name2;
        name2=temp;
        System.out.println("After swapping" +" "+ name1 +" "+" "+ name2);
        //=============================================================
        //Logic 2 to swapping (by using + & -)
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("swap"+" "+ a +" " +" "+b);
        //==============================================================
        // logic 3 to swapping (by using * )
        // here a & b values should not be Zero.
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("swapping"+" "+ a +" "+" "+b);
        //===============================================================



    }

}
