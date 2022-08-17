package main.java.com.dsa;

import java.util.Stack;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #150 - Evaluate Reverse Polish Notation
 */
public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens={"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> s= new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(!"/+-*".contains(tokens[i])){
                s.push(Integer.parseInt(tokens[i]));
            }else{
                String sign=tokens[i];
                int b=s.pop();
                int a=s.pop();

                if(sign.equalsIgnoreCase("+")){
                    s.push(a+b);
                }
                if(sign.equalsIgnoreCase("-")){
                    s.push(a-b);
                }if(sign.equalsIgnoreCase("*")){
                    s.push(a*b);
                }if(sign.equalsIgnoreCase("/")){
                    s.push(a/b);
                }
            }
        }
        return s.pop();

    }
}

