package main.java.com.dsa;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode # 56-Merge Intervals
 */
public class MergeIntervals {

    public static void main(String[] args) {
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
        Arrays.stream(merge(intervals)).forEach(e-> Arrays.stream(e).forEach(System.out::print));
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged= new LinkedList<>();
        for(int [] interval: intervals){
            if(merged.isEmpty()|| merged.getLast()[1]<interval[0]){
                merged.add(interval);
            }else{
                merged.getLast()[1]= Math.max(merged.getLast()[1],interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

}
