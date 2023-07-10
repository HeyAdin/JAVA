public class SearchRotaredArray2 {
    public static void main(String[] args) {
        int[] arr = {0,13};
        int target =13; 
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
            if(nums[mid]==nums[high] && nums[mid]==nums[low]){
                low =(low+1)%nums.length;
                high = high-1;
            }
            if(nums[mid] >=nums[low]){
                if(target>= nums[low] && target<nums[mid]){
                    high = mid -1;
                }
                else{
                    low = mid+1;
                }
            }

            else if(nums[mid]<=nums[low]){
                if(target> nums[mid] && target<=nums[high]){
                    low = mid +1;
                }
                else{
                    high = mid-1;
                }
            }
            
        }
        return false;
    }
}
