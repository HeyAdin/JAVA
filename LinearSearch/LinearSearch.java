import java.util.*;
class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {12, 4, 2, 6, 9, 1, 17, 39, 23, 14, 5, 31};
        int target = 0;
        System.out.println(ls(arr, target));
    }

    static int ls(int[] arr, int target){
        // edge cases starts
        if(arr.length==0){
            return -1;
        }
        // edge cases starts over

        // Checking starts 
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}