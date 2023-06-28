public class MaxArry {
    public static void main(String[] args) {
        int[] arr = { 14, 23 ,-12, -32, -7, -15, -19, -28, -65, -17, -11, -9, -14, -29, -37, 65 , 25 ,};
        System.out.println(max(arr));
        System.out.println(rangeMax(arr, 2, 7));

    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Search in a range
    static int rangeMax(int[] arr, int from, int to) {
        int max = arr[from];
        for(int i=from;i<=to;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

}
