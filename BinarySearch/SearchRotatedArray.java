public class SearchRotatedArray {
    public static void main(String[] args) {
        int[] arr = {3,1};
        int target=1;
        System.out.println(search(arr, target));
    }

    static int search(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>=nums[low]){
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
        return -1;
    }

    
}
