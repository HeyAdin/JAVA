import java.util.*;
public class LSin2DArr{
    public static void main(String[] args){
        int[][] arr= {
            {12, 14,6},
            {9,17,21, 33, 2, 39},
            {4, 23, 31, 7, 0},
            {12, 14,6},
            {9,17,21, 33, 2, 39},
            {4, 23, 31, 7, 0}
        };
        int target= 4;
        System.out.print("Element is at this Position : ");
        System.out.println(Arrays.toString(searchIn2D(arr, target)));
        System.out.println("Maximum Value is : "+ maxIn2DArr(arr));
    }

    // function Linear Search in 2D Array

    static int[] searchIn2D(int[][]arr, int target){
        int[] ans ={-1,-1,};
        if(arr.length==0){
            return ans;
        }

        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                if(arr[row][col]==target){
                    ans[0]=row;
                    ans[1]=col;
                    return ans;
                }
            }
        }
        return ans;
    }

    // function to find maximum in 2D Array

    static int maxIn2DArr(int[][] arr){
        int maxVal= arr[0][0];
        if(arr.length==0){
            System.out.println("Null Array");
            return -1;
        }
        
        int[] arry=new int[2];
        for(int row = 0; row<arr.length;row++){
            for(int col =0; col<arr[row].length;col++){
                if(maxVal<=arr[row][col]){
                    maxVal=arr[row][col];
                    arry[0]=row;
                    arry[1]=col;
                }
            }
        }
        System.out.println("MAximum value index : "+Arrays.toString(arry));
        return maxVal;
    }
}