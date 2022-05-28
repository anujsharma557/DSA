package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: reverse a signed integer , return 0 in case of the reversed value is out of range of 32 bit integer
 */
public class ReverseSignedInteger {
    public static void main(String[] args) {
        int x=-234;
        System.out.println(reverse(x));
    }
    public static int reverse(int x) {
        int val=x;
        int rev=0;
        boolean negativeFlag = false;
        if (val < 0)
        {
            negativeFlag = true;
            val = -val ;
        }
        while(val>0){
            int rem=val%10;
            val=val/10;
            if(rev<Integer.MIN_VALUE/10 ||rev>Integer.MAX_VALUE/10){
                return 0;
            }
            rev=rev*10+rem;
        }
        rev=negativeFlag==true?-rev:rev;

        return rev;
    }
}
