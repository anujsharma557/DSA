package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #136 - Single Number
 * If we take XOR of zero and some bit, it will return that bit
 * a XOR 0 = a; a XOR 0=a
 * If we take XOR of two same bits, it will return 0
 * a XOR a = 0;
 * a XOR b XOR a = (a XOR a) XOR b = 0 XOR b = b ; a XOR b XOR a=(a XOR a)XOR b= 0 XOR b=b
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums ={4,1,2,1,2};
        System.out.println(singleNumber(nums ));
    }
    /*public static int singleNumber(int[] nums) {
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            res=res^nums[i];
        }
        return res;

    }*/
    public static int singleNumber(int[] nums) {
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }
}
