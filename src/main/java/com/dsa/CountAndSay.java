package main.java.com.dsa;

import java.util.Arrays;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #38 - Count and Say
 */
public class CountAndSay {
    public static void main(String[] args) {
        int n=5;
       System.out.println(countAndSay(n));
    }
    public static String countAndSay(int n) {
        StringBuilder number=new StringBuilder();
        number.append("1");
        while(n>1){
            number = countAndSay1(number);
            n--;
        }
        return String.valueOf(number);

    }
    public static StringBuilder countAndSay1(StringBuilder number){
        char ch= number.charAt(0);
        int count=0;
        StringBuilder number2=new StringBuilder();
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)==ch){
                count++;
            }else{
                number2.append(count);
                number2.append(ch);
                ch= number.charAt(i);
                count=1;

            }
        }
        number2.append(count);
        number2.append(ch);

        return number2;
    }

}
