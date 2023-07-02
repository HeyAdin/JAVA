public class EvenNoOfDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,786};
        System.out.println(findNumbers(arr));

    }
    public static int findNumbers(int[] nums) {
       int evenNo=0;
       int digitCount=0;
       for(int i =0;i<nums.length;i++){
           digitCount=digitCounter(nums[i]);
           if(evenCheck(digitCount)){
            evenNo+=1;
           }
       }
       return evenNo;
    }

    public static int digitCounter(int num){
        int count=0;
        while(num>0){
            num=num/10;
            count+=1;
        }
        return count;
    }
    public static boolean evenCheck(int numCount){
        if(numCount%2==0){
            return true;
        }
        return false;
    }
}
