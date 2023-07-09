public class SearchRotatedArray {
    public static void main(String[] args){
        int[] arr = {23, 33, 34, 38, 39, 41, 45, 50, 51, 53, 58, 59, 62, 67, 70,73, 0, 1, 3, 4, 7, 8, 12, 13, 15, 16, 17, 19};
        int target = 0;
        System.out.println(searchInRotated(arr, target));
    }

    static int searchInRotated(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>=target && target>=nums[high]){
                high=mid-1;
            }
            else if(nums[mid]<=target && target<=nums[low]){
                low=mid+1;
            }
        }
        return -1;
    }

}
