package main.java.com.dsa;

import java.util.Stack;
/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #84 - Largest Rectangle in Histogram
 */
public class MaxRectangleAreaInHistogram {
    public static void main(String[] args){
        int [] input={1,2,3,4};
        int maxArea = maxRectangleAreaInHistogram(input);
        System.out.println(maxArea);
    }

    private static int maxRectangleAreaInHistogram(int[] input) {
         int maxArea=0;
         Stack<Integer> s= new Stack<>();
         int i=0;
         while(i<input.length){
             if(s.isEmpty() || input[i]>=input[s.peek()]){
                 s.push(i);
                 i++;
             }else {
                 int top= s.pop();
                 int area= input[top]*(s.isEmpty()?i:i-s.peek()-1);
                 System.out.println("area:"+area);
                 maxArea=Math.max(maxArea,area);
                 System.out.println("maxArea:"+maxArea);
             }
         }
        // this case is only if  the remaining last are all  (increasing sequences or equal)
         while(!s.isEmpty()) {
             int top= s.pop();
             maxArea = Math.max(maxArea, input[top] * (s.isEmpty() ? i : i - s.peek() - 1));
         }
    return maxArea;
    }

}
