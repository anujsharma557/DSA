package main.java.com.dsa;

import java.util.Arrays;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s="{[()]}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        if(s==null || s.isEmpty()){
            return false;
        }
        Stack stack= new Stack();
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == '}') {
                if (!stack.isEmpty() && stack.peek().equals('{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }else if (s.charAt(i) == ')') {
                if (!stack.isEmpty() && stack.peek().equals('(')) {
                    stack.pop();
                } else {
                    return false;
                }
            }else if (s.charAt(i) == ']') {
                if (!stack.isEmpty() && stack.peek().equals('[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }


}
