import java.util.*;
public class MultiDimArryList {
    public static void main(String[] args) {
        // Syntax

        ArrayList<ArrayList<String>> myString = new ArrayList<>(3);
        
        // Initialisation 
        for(int i=0; i<3;i++){
            myString.add(new ArrayList<>(3));
        }

        Scanner in = new Scanner(System.in);

        // Taking input 

        System.out.println("Enter the 9 names");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                myString.get(i).add(in.next());
            }
        }
        
        //  Print Output as Printed in ArrayList
        System.out.println(myString);
        
        //  Output using for loop
        
        for (int i = 0; i < 3; i++) {
            System.out.println(myString.get(i));
        }
    }
}
