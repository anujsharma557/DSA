package main.java.com.dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode # 77 -     Combinations
 */
public class Combinations {
    public static void main(String[] args) {
        int n=4;
        int k=2;
        System.out.println(combine(n,k));
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr= new LinkedList<>();
        int start=1;
        findCombo(res,curr,start,k,n);
        return res;


    }

    public static void findCombo(List<List<Integer>> res, List<Integer> curr, int start, int k, int n) {
        if(curr.size()==k){
            res.add(new ArrayList(curr));
            return;
        }

        for(int i=start;i<=n;i++){
            curr.add(i);
            findCombo(res,curr,i+1,k,n); // we dont do start +1 but i+1, realize this
            curr.remove(curr.size()-1);
        }

    }
}
