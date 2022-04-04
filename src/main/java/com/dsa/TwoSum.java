package main.java.com.dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {11, 7, 12, 2};
        int target = 9;
        Arrays.stream(twoSum(arr, target)).forEach(System.out::println);
    }

    private static int[] twoSum(int[] arr, int target) {
        int[] res=new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                res[0]=map.get(target - arr[i]);
                res[1]=i;
                return res;
            } else {
                map.put(arr[i], i);
            }
        }
        res[0]=-1;
        res[1]=-1;
        return res;
    }
}
