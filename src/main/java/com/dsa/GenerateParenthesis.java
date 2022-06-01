package main.java.com.dsa;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #22 - Generate Parentheses
 */
public class GenerateParenthesis {
    public static void main(String[] args) {
        GenerateParenthesis(3);
    }
    private static void GenerateParenthesis(int n){
        List<String> res= new ArrayList<>();
        generated(res,new StringBuffer(),0,0,n);
        res.forEach(System.out::println);
    }
    private static void generated(List<String> res, StringBuffer seq, int open, int close, int len) {
        if(seq.length()==len*2){
            if(isValid(seq.toString()))
                res.add(seq.toString());
            return;
        }else{
            if(open<len){
                seq.append('(');
                generated( res,seq, open+1,close,len);
                seq.deleteCharAt(seq.length()-1);
            }
            if(close<open){ // this should be less than open so than we don't need to do validation of the string
                seq.append(')');
                generated( res,seq, open,close+1,len);
                seq.deleteCharAt(seq.length()-1);
            }
        }

    }
    private static boolean isValid(String seq){
        int count=0;
        for(int i=0;i<seq.length();i++){
            if(seq.charAt(i)=='('){
                count++;
            }else{
                count--;
            }
            if(count<0){
                return false;
            }
        }
        return true;

    }
}
