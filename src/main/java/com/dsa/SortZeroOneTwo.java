import java.util.Arrays;

/**
 * sort 0,1,2
 * Complexity=o(n)
 */
public class SortZeroOneTwo {
    public static void main(String [] args){
        int[] arr={2,2,1,2,0};
        sortZeroOneTwo(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void sortZeroOneTwo(int[] arr) {
        int left=0;
        int mid=0;
        int right=arr.length-1;
        while(mid<=right){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[left];
                arr[left]=temp;
                left++;
                mid++;
            }else if(arr[mid]==2){
                int temp=arr[mid];
                arr[mid]=arr[right];
                arr[right]=temp;
                right--;
            }else{
                mid++;
            }
        }
    }
}
