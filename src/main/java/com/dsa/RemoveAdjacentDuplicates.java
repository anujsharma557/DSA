package main.java.com.dsa;

/**
 * remove adjacent duplicates
 */
public class RemoveAdjacentDuplicates {

    public static void main(String[] args){
        int [] input={1,5,7,8,8,8,0,1,1,0,6,5};
         int pointer=removeAdjacentDuplicates(input);
         for(int i=0;i<=pointer;i++){
             System.out.println(input[i]);
         }
    }

    private static int removeAdjacentDuplicates(int[] input) {
        int ptr=-1;
        int i=0;
        while(i<input.length ){
            if(ptr==-1 || input[ptr]!=input[i]){
                ptr++;
                input[ptr]=input[i];
                i++;
            }else{
                while(i<input.length && input[ptr]==input[i]){
                    i++;
                }
               ptr--;
            }
        }
        return ptr;

    }
}
