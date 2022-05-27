package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description:
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        String s="aabbaad";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        int maxlen=1;
        int left=0;
        int right=0;
        int []res = new int[2];
        for(int i=1;i<s.length()-1;i++){
            left=i;
            right=i+1;
            while( (left>=0 && right<s.length())  && s.charAt(left)==s.charAt(right) ){
                if(maxlen<right-left+1){
                    maxlen= right-left+1;
                    res[0]=left;
                    res[1]=right;
                }
                left--;
                right++;
            }
            left=i-1;
            right=i+1;
            while((left>=0 && right<s.length())  && s.charAt(left)==s.charAt(right)){
                if(maxlen<right-left+1){
                    maxlen= right-left+1;
                    res[0]=left;
                    res[1]=right;
                }
                left--;
                right++;
            }

        }
        return s.substring(res[0],res[1]+1);
    }
}
