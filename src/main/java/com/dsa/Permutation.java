package main.java.com.dsa;

public class Permutation {

    public static void main(String [] args){
        String s="Anuj";
        String prefix="";
        permutation(s,prefix);
    }

    private static void permutation(String s, String prefix) {
        if(s.length()==0){
            System.out.println(prefix);
            System.out.println();
        }else{
            for(int i=0;i<s.length();i++){
                System.out.println("s:"+s);
                String rem=s.substring(0,i)+s.substring(i+1);
                System.out.println("res.substring(0,"+i+"):"+s.substring(0,i));
                System.out.println("s.substring("+(i+1)+")"+s.substring(i+1));
                System.out.println("rem:"+rem);
                System.out.println("prefix+s.charAt("+i+"):"+prefix+s.charAt(i));
                permutation(rem,prefix+s.charAt(i));
            }
        }
    }
}
