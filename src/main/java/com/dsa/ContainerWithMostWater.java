package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #11 - Container With Most Water
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height= {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int maxarea=0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            maxarea=Math.max(maxarea,Math.min(height[i],height[j])*(j-i))  ;
            if(height[i]<height[j]){
                i++;

            }else{j--;}
        }
        return maxarea ;
    }

}
