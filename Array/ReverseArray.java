import java.util.*;
class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 9, 12, 7 ,90};
        System.out.println(Arrays.toString(reversedArr(arr)));
    }

    static int[] reversedArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int temp;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}