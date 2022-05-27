package main.java.com.dsa;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: longest substring without repeating characters
 */
public class MaxLengthNoneRepeatingCharSubString {
    static String a="aaab!dab";
    public static void main(String[] args) {
        int length=lengthOfLongestSubstring(a);
        System.out.println("length:"+length);
    }
    public static int lengthOfLongestSubstring(String s) {
        char[] ch = new char[26];
        Map<Character, Integer> map = new HashMap<>();
        int maxlen = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                // this is to rule out the case where the repeating character is not withing the current substring being processed
                int pos = map.get(s.charAt(i));
                if (start <= pos) {
                    start = pos + 1;
                }
                map.put(s.charAt(i), i);
                maxlen = Math.max(maxlen, i - start + 1);
            } else {
                map.put(s.charAt(i), i);
                maxlen = Math.max(maxlen, i - start + 1);
            }

        }
        return maxlen;
    }

}
