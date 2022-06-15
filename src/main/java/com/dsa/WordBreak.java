package main.java.com.dsa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #139 - WordBreak
 * time: O(N^3)
 */
public class WordBreak {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        String s = "applepenapple";
        List<String> wordDict=new ArrayList<>();
        wordDict.add("apple");
        wordDict.add("pen");
        System.out.println(wordBreak(s,wordDict));
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet<>(wordDict);
        boolean[] dp= new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j] && wordDictSet.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
