import java.util.*;
class Array{
    public static void main(String[] args) {

        int[] arr; // Array Declaration
        arr = new int[5];  // Array Initialisation
        
        // Assigning Values
        arr[0] = 3;  //0th index
        arr[1] = 6;  //1st index
        arr[2] = 1;  //2nd index
        arr[3] = 16; //3rd index
        arr[4] = 10; //4th index

        // Printing Array
        System.out.print(arr[0] + ", ");
        System.out.print(arr[1] + ", ");
        System.out.print(arr[2] + ", ");
        System.out.print(arr[3] + ", ");
        System.out.println(arr[4] + ", ");

        System.out.println("Another method of input and output ");

        // Or
        // Declaration Initialisation Assignin in one line
        int[] arr1 = {2, 4, 3, 9, 12, 7};

        // print this line using above method or by iterating 

        for(int i = 0; i<arr1.length;i++){
            System.out.print(arr1[i] + ", ");
        }

        System.out.println();
        // Taking Array Input from user 

        int[] usrArry=new int[5];
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the element of Array");

        // manually enter like usrArry[0]=in.nextInt(); then for usrArry[1] so on 

        //Or use a for loop

        for (int i = 0; i < usrArry.length; i++) {
            usrArry[i]=in.nextInt();
        }

        // for Output we can use these methods

        System.out.println("Output through for loop");
        
        for (int i = 0; i < usrArry.length; i++) {
            System.out.print(usrArry[i]+ ",");
        }
        System.out.println();

        System.out.println("Output through for enhanced for loop");
        
        for(int out : usrArry){
            System.out.print(out + ",");
        }
        System.out.println();

        System.out.println("Output through for Arrays.toSring method");

        System.out.println(Arrays.toString(usrArry));
    }
}