public class SearchRotaredArray2 {
    public static void main(String[] args) {
        int[] arr = {9, 12, 13, 13, 0, 2, 3, 3, 3, 7, 9};
        int target = 0; //returning false changing conditions
        System.out.println(search(arr,target));
    }

    static boolean search(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return true;
            }
            else if(nums[low]>nums[mid]){
                if(target>=nums[low] && target>nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else if(nums[mid]>= nums[low]){
                if(target>=nums[low] && target<nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
        }
        return false;
    }
}
