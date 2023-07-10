public class Pivot {
    public static void main(String[] args) {
        int[] arr= {1};
        System.out.println(pivot(arr));
    }

    static int pivot(int[] nums){
        int low =0; 
        int high = nums.length-1;

        if(nums[low]<nums[high]){
            return low;
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]>nums[mid+1]){
                return mid+1%(high+1);
            }
            else if(nums[mid]>=nums[low]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}
