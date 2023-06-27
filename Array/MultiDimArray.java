import java.util.*;
class MultiDimArray{
    public static void main(String[] args) {
        // Syntax of 2D Array
        int[][] arr=new int[3][3];
        // manually assign the value
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;
        
        // manually print the value one by one
        
        System.out.print(arr[0][0] + ",");
        System.out.print(arr[0][1] + ",");
        System.out.print(arr[0][2] + ",");
        System.out.println();
        System.out.print(arr[1][0] + ",");
        System.out.print(arr[1][1] + ",");
        System.out.print(arr[1][2] + ",");
        System.out.println();
        System.out.print(arr[2][0] + ",");
        System.out.print(arr[2][1] + ",");
        System.out.print(arr[2][2] + ",");

        System.out.println();

        System.out.println("Another Array Printed using for loop");

        // Direct Syntax


        int[][]arr1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print manulally one by one or use loop

        // for iterating over row
        for(int row =0; row <arr1.length; row++){
            // for iterating over column
            for(int col =0; col<arr1[row].length; col++){

                System.out.print(arr1[row][col]+ ",");
            }
            System.out.println();
        }
        

        // Taking input from user for 2D array


        int[][] arry2 = new int[3][3];
        System.out.println("Enter elements for the matrices");

        Scanner in = new Scanner(System.in);

        for(int row = 0; row < arry2.length; row++){
            for(int col = 0; col< arr[row].length; col++){
                arry2[row][col]=in.nextInt();
            }
        }

        // Output using these methods

        for(int row =0; row <arry2.length; row++){
            // for iterating over column
            for(int col =0; col<arry2[row].length; col++){

                System.out.print(arry2[row][col]+ ",");
            }
            System.out.println();
        }

        // toString method

        System.out.println("Printed Using to String method");
        for(int row =0; row <arry2.length; row++){
            // for iterating over column
        System.out.println(Arrays.toString(arry2[row]));
            System.out.println();
        }

        // Enhanced for loop

        System.out.println("printed using enhace for loop");
    
        for(int[] array : arry2){
            System.out.println(Arrays.toString(array));
        }
    }
}