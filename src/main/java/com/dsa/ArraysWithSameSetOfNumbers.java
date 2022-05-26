package main.java.com.dsa;

import java.util.HashMap;
import java.util.Map;

public class ArraysWithSameSetOfNumbers {
    public static void main(String [] args){
        int a[]={2,5,6,8,10,2,2};
        int b[]={1,2,2,8,10,5,6};
        boolean isSameSet=arrysWithSameSetOfNumber(a,b);
        System.out.println("isSameSet:"+isSameSet);
    }

    private static boolean arrysWithSameSetOfNumber(int[] a, int[] b) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i:a){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        for(int i:b){
            if(map.containsKey(i)){
                map.put(i,map.get(i)-1);
            }else{
               return Boolean.FALSE;
            }
        }
        return map.values().stream().allMatch(integer -> integer==0);
    }

}
