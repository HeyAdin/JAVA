public class SearchInsertPosition {
    public static void main(String[] args){
        int[] arr = {16, 21, 24, 25, 36, 1, 2, 4, 5, 7, 9, 13, 15};
        int target = 12;
        System.out.println(lowerBound(arr,target));
    }

    static int lowerBound(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length; //Hypothetical Index 

        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] >= target){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}
