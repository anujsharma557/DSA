package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #8 - String To Integer (atoi)
 */
public class MyAtoi {
    public static void main(String[] args) {
        String s= "42";
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {
        double  res=0;
        boolean negative=false;
        int j=0;
        while(j<s.length() && Character.isWhitespace(s.charAt(j))){
            j++;
        }
        if(j==s.length()){
            return 0;
        }
        if(!Character.isDigit(s.charAt(j)) && (s.charAt(j)!='-' &&  s.charAt(j)!='+')){
           return 0;
        }
        if(s.charAt(j)=='-'){
            negative=true;
            j++;
        }else if(s.charAt(j)=='+'){j++;}
        for(int i=j;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int curr=(int)s.charAt(i)-'0';
                if(res<Integer.MIN_VALUE && negative){
                    return Integer.MIN_VALUE;
                }
                if(res>Integer.MAX_VALUE && !negative){
                    return Integer.MAX_VALUE;
                }
                res=res*10+curr;
            }else{
                if(negative){
                    return (int) -res;
                }else{
                    return (int) res;
                }
            }
        }
        if(negative){
            res=-res;
        }
        if(res<Integer.MIN_VALUE ){
            return Integer.MIN_VALUE;
        }
        if(res>Integer.MAX_VALUE ){
            return Integer.MAX_VALUE;
        }
        return (int) res;
    }
}
