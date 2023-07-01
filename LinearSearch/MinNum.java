import java.util.*;
class MinNum{
    public static void main(String[] args){
        int[] arr = {12, 4, 2, 6, 9, 1, 17, 39, 23, 14, 5, 31};
        System.out.println(minimumNo(arr));
        int start = 6,end=10;
        System.out.println(minRange(arr, start, end));
    }

    // Search Minimum value in an Array

    static int minimumNo(int[] arr){
        int minVal=Integer.MAX_VALUE;
        // edge cases
        if(arr.length == 0){
            System.out.println("Null Array");
            return -1;
        }
        for(int i = 0; i<arr.length;i++){
            if(arr[i]<= minVal){
                minVal=arr[i];
            }
        }
        return minVal;
    }

    // Search Minimum value in an Array in a Range

    static int minRange(int[] arr, int start, int end){
        int minVal=Integer.MAX_VALUE;
        // edge cases
        if(arr.length == 0){
            System.out.println("Null Array");
            return -1;
        }
        for(int i = start; i<=end;i++){
            if(arr[i]<= minVal){
                minVal=arr[i];
            }
        }
        return minVal;
    }
}