package primeNumberExamples;

public class primeNumbers {
    public static void main(String[] args) {
        int num =56;
        boolean isprime=true;

        if(num<=1){
            isprime=false;

        }else {
            for (int i=2;i<=Math.sqrt(num);i++){
                if (i%num==0){
                    isprime=false;
                    break;

                    //logic for prime number
                    //with is divided by that number and 1 comes "0"(2%2=0 && 1%2=0)
                    // ex:10%10=0 &&  1%10=0
                    //ex:3%3=0 && 1%3=0
                    // top two prime number examples.
                }

            }
        }
        if (isprime){
            System.out.println("it is prime number");
        }else {
            System.out.println("it is not a prime number");
        }
    }
}
