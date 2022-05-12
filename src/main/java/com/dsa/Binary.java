package main.java.com.dsa;

import java.util.Arrays;

/**
 * print all binary for value of n
 */
public class Binary {
 static int n=3;
    private static int[] A=new int[n];

    public static void main(String [] args){

        binary(n);
    }

    public static void binary(int n) {
        if (n < 1){
            Arrays.stream(A).forEach(System.out::print);
        System.out.println();
    }
        else{
            A[n-1]=0;
            binary(n-1);
            A[n-1]=1;
            binary(n-1);
        }
    }
}
