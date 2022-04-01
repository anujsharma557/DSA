package main.java.com.dsa;

public class SearchInRotatedArray {
    public static void main(String [] args){
        int[] arr={1,5,6,7,8};
        int find=1;
        System.out.println(findInRotatedArray(arr,find));
    }

    private static int findInRotatedArray(int[] arr,int find){
        int pivot=findPivot(arr,0,arr.length-1);
        System.out.println("pivot:"+pivot);
        if(arr[pivot]==find){
            return pivot;
        }else if(arr[pivot]>find){
            return binarySearch(arr,find,0,pivot-1);
        }else {
            return binarySearch(arr,find,pivot+1,arr.length-1);
        }
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
