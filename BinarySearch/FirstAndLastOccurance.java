import java.util.*;
public class FirstAndLastOccurance {
    public static void main(String[] args){
        int[] arr = {1, 3, 4, 7, 7, 7, 7, 9, 12, 12, 14, 15, 18, 19, 19, 19, 19, 23, 25, 25, 26, 29, 29, 29, 32};
        int target = 7;
        System.out.println(Arrays.toString(firstOccurrance(arr, target)));
    }
    static int[] firstOccurrance(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int[] ans = new int[2];
        ans[0]=-1;
        ans[1]=lastOccurrance(arr, target); // in case answer not found

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid] == target){
                ans[0] = mid;
                high = mid-1;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    static int lastOccurrance(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int ans = -1; // in case answer not found

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid] == target){
                ans = mid;
                low = mid+1;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
