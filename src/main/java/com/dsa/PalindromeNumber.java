package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #9 - Palindrome Number
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        int n=121;
        System.out.println(isPalindrome(n));

    }
    public  static boolean isPalindrome(int x) {
        int num=x;
        int rev=0;
        while(num>0){
            int rem=num%10;
            num=num/10;
            rev=rev*10+rem;
        }
        return rev==x;
    }
}
