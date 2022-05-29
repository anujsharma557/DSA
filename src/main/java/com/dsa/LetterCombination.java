package main.java.com.dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #15 - Letter Combinations of a Phone Number
 */
public class LetterCombination {

        private static List<String> combinations = new ArrayList<>();

        private static Map<Character, String> map = Map.of(
                '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
                '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");
        public static void main(String[] args) {
                String digits="23";
                System.out.println(letterCombination(digits));
        }
        public static List<String> letterCombination(String digits){
                if(digits.isEmpty()){
                        return combinations;
                }
                findCombination(0,new StringBuffer(),digits);
                return combinations;
        }
        private static void findCombination(int i,StringBuffer path,String inputDigits){
               if(inputDigits.length()==path.length()){
                       combinations.add(String.valueOf(path));
                       return;
               }
               String keyString=map.get(inputDigits.charAt(i));
               for(int j=0;j<keyString.length();j++){
                       path.append(keyString.charAt(j));
                       findCombination(i+1,path,inputDigits);
                       path.deleteCharAt(path.length()-1);
               }
        }
}
