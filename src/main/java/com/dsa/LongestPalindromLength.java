package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: find length of longest palindrome in a string
 */
public class LongestPalindromLength {
    public static void main(String[] args) {
        String s="babad";
        System.out.println(longestPalindrome(s));
    }
    public static int longestPalindrome(String s) {
        int maxlen=1;
        int left=0;
        int right=0;

        for(int i=1;i<s.length()-1;i++){
                left=i;
                right=i+1;
                while( (left>=0 && right<s.length())  && s.charAt(left)==s.charAt(right) ){
                    maxlen=Math.max(maxlen,right-left+1);
                    left--;
                    right++;
                }
                left=i-1;
                right=i+1;
                while((left>=0 && right<s.length())  && s.charAt(left)==s.charAt(right)){
                    maxlen=Math.max(maxlen,right-left+1);
                    left--;
                    right++;
                }

        }
        return maxlen;
    }
}
