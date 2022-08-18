package main.java.com.dsa;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #3 - Longest Substring Without Repeating Characters
 */
 public class LongestSubstringWithoutRepeatingCharacters {
    public static void longestSubstringWithoutRepeatingCharacters(String s){
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        System.out.println(ans);
    }
    public static void main(String [] args){
        longestSubstringWithoutRepeatingCharacters("anujaytredca");
    }

}
