package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description:
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    private static String longestCommonPrefix(String[] strs) {

         String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            prefix=getPrefix(prefix,strs[i]);
        }
        return prefix;
    }
    private static String getPrefix(String prefix, String str) {
        int i=0;
        while(i<Math.min(prefix.length(),str.length())){
            if(prefix.charAt(i)!=str.charAt(i)){
                break;
            }else{
                i++;
            }
        }
        return prefix.substring(0,i);
    }
}
