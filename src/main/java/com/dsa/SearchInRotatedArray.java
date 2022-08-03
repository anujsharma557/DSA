package main.java.com.dsa;

/**
 * this approach is the slowest one avoid recursion and try solving in single scan
 * follow commented code for better solution
 */
public class SearchInRotatedArray {

    /**
     * this is best approach
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] >= nums[start]) {
                if (target >= nums[start] && target < nums[mid])
                    end = mid - 1;
                else start = mid + 1;
            } else {
                if (target <= nums[end] && target > nums[mid])
                    start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 8};
        int find = 1;
        System.out.println(findInRotatedArray(arr, find));
    }

    private static int findInRotatedArray(int[] arr, int find) {
        int pivot = findPivot(arr, 0, arr.length - 1);
        System.out.println("pivot:" + pivot);
        if (arr[pivot] == find) {
            return pivot;
        } else if (arr[pivot] > find) {
            return binarySearch(arr, find, 0, pivot - 1);
        } else {
            return binarySearch(arr, find, pivot + 1, arr.length - 1);
        }
    }

    private static int findPivot(int[] arr, int start, int end) {
        if (start == end) {
            return start;
        } else if (start == end - 1) {
            if (arr[start] >= arr[end]) {
                return start;
            } else {
                return end;
            }
        } else {
            int mid = (start + end) / 2;
            if (arr[start] < arr[mid]) {
                return findPivot(arr, mid, end);
            } else {
                return findPivot(arr, start, mid);
            }
        }
    }

    public static int binarySearch(int[] arr, int find, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == find)
                return mid;
            else if (arr[mid] > find) {
                return binarySearch(arr, find, start, mid - 1);
            } else {
                return binarySearch(arr, find, mid + 1, end);
            }
        }
        return -1;
    }

   /* public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] >= nums[start]) {
                if (target >= nums[start] && target < nums[mid])
                    end = mid - 1;
                else start = mid + 1;
            }
            else {
                if (target <= nums[end] && target > nums[mid])
                    start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }*/
}
