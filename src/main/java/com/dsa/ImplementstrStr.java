package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #28 - Implement strStr()
 */
public class ImplementstrStr {
    public static void main(String[] args) {
        String haystack="hello";
        String needle="ll";
        System.out.println(strStr( haystack,  needle));
    }
    public static int strStr(String haystack, String needle) {
        if(needle==null || needle.length()==0){
            return 0;
        }
        int j=0;
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if (haystack.substring(i,i+needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;

    }
}
