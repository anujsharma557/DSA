package main.java.com.dsa;

import java.util.Stack;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode # 32 - Longest Valid Parentheses
 * Initailally add -1 to stack that represent invalid value
 * keep adding index for ( bracket if the cunter matches remove this and find the length from the invalid value that is on top of stack
 * invalid value means point after that every thing is valid
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
