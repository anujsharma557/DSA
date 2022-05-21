package main.java.com.dsa;

import java.util.Arrays;

/**
 * separate even odd complexity-o(n)
 */
public class SeparateEvenOdd {
    public static void main(String [] args){
        int[] arr={1,5,6,0,7,8,4,6,7,9};
        separateEvenOdd(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void separateEvenOdd(int[] arr) {
        int left=0;
        int right= arr.length-1;
        while(left<right) {
            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }
            while (arr[right] % 2 != 0 && left < right) {
                right--;
            }
            if (left < right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
    }
}
