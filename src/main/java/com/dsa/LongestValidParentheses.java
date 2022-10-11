package main.java.com.dsa;

import java.util.Stack;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode # 32 - Longest Valid Parentheses
 */
public class LongestValidParentheses {
    public static void main(String[] args) {
        String s11="()((())(())))(";
        String s="()(((())))((()))";
        System.out.println(longestValidParentheses(s));
    }
    public static int longestValidParentheses(String s) {
        int len=0;
        int max=0;
        int curr=0;
        if(s.length()==0 || s.length()==1){
            return 0;
        }
        Stack<Integer> stack= new Stack<>();
        stack.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    max = Math.max(max, i - stack.peek());
                }
            }
        }
        return max;
    }
}
