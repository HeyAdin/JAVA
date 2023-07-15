public class Pivot {
    public static void main(String[] args) {
        int[] arr = { 1 };
        System.out.println(pivot(arr));
    }

    static int pivot(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int n = nums.length;
        while (low <= high) {

            if (nums[low] <= nums[high]) {
                return nums[low];
            }

            int mid = low + (high - low) / 2;
            int next = (mid + 1) % n;
            int prev = (mid - 1 + n) % n;
            if (nums[mid] <= nums[prev] && nums[mid] <= nums[next]) {
                return nums[mid];
            } else if (nums[low] <= nums[mid]) {
                low = mid + 1;
            } else if (nums[mid] <= nums[high]) {
                high = mid - 1;
            }
        }
        return -1;
    }
}
