package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #42 - Trapping Rain Water
 */
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        if (height.length==0) return 0;
        int left = 0, right = height.length-1;
        int leftMax=0, rightMax=0;
        int ans = 0;
        while (left < right) {
            if (height[left] > leftMax) leftMax = height[left];
            if (height[right] > rightMax) rightMax = height[right];
            if (leftMax < rightMax) {
                ans += leftMax-height[left];
                left++;
            } else {
                ans += rightMax-height[right];
                right--;
            }
        }
        return ans;
    }
}
