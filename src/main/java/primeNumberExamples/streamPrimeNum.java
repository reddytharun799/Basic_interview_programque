package primeNumberExamples;

import java.util.stream.IntStream;

public class streamPrimeNum {
    public static void main(String[] args) {
        int num =29;
        boolean isPrime=num<1 &&
                IntStream.rangeClosed(2,(int) Math.sqrt(num))
                        .noneMatch(i -> num%i==0);
        if (isPrime){
            System.out.println(num+" "+"it is not a prime number");
        }else {
            System.out.println(num+": "+ "it is  a prime number");
        }
    }
}
