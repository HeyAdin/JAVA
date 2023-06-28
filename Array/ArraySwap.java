import java.util.*;
public class ArraySwap {
    public static void main(String[] args) {
        int[] arr = {12, 32, 7, 5, 19, 28, 17, 11, 9, 14, 29, 37};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(swap(arr, 0, 1)));

    }
    static int[] swap(int[] arr, int first,int second){
        int temp;
        temp = arr[first];
        arr[first]=arr[second];
        arr[second]= temp;
        return arr;
    }
}
