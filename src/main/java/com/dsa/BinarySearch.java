package main.java.com.dsa;

public class BinarySearch {
    public static void main(String [] args){
        int[] arr={-5,-3,7,8,9};
        int find=-3;
        System.out.println(binarySearch(arr,find,0,arr.length-1));
    }
    public static int binarySearch(int[] arr,int find,int start,int end){
        if(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==find)
                return mid;
            else if(arr[mid]>find){
                return binarySearch(arr,find,start,mid-1);
            }else{
                return binarySearch(arr,find,mid+1,end);
            }
        }
        return -1;
    }
}
