package main.java.com.dsa;

public class PivotInRotatedArray {
    public static void main(String [] args){
        int[] arr={5,6,7,8,9,1,2,3,4};
        System.out.println(findPivot(arr,0,arr.length-1));
    }

    private static int findPivot(int[] arr, int start, int end) {
        if(start==end){
            return start;
        }else if(start==end-1){
            if(arr[start]>=arr[end]){
                return start;
            }else{
                return end;
            }
        }else{
            int mid =(start+end)/2;
            if(arr[start]<arr[mid]){
                return findPivot(arr,mid,end);
            }else{
                return findPivot(arr,start,mid);
            }
        }
    }
}
