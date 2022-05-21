package main.java.com.dsa;

/**
 * Number of trailing zero in N factorial
 */
public class NoOfTrailingZerosInFactorial {
    public static void main(String [] args){
        int n=100;
        int trailingZeroCount=noOfTrailingZerosInFactorial(n);
        System.out.println("trailingZeroCount"+trailingZeroCount);
    }

    private static int noOfTrailingZerosInFactorial(int n) {
        int count=0;

         while(n>0){
              n=n/5;
             count=count+n;
         }
        return count;
    }
}
