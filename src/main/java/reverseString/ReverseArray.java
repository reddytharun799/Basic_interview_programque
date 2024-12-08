package reverseString;

import java.util.Arrays;

public class ReverseArray {
    //int[] reverse={1,2,3,4};

    public static void main(String[] args) {
        int[] reverse={1,2,3,4};
        System.out.println("Original string" + Arrays.toString(reverse));

        reverseArray(reverse);

        System.out.println("reverse" +Arrays.toString(reverse));
    }
    public static void reverseArray(int[] arr){
        int left =0;
        int right= arr.length-1;
        for(;left<right;){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;









        }
    }

}
