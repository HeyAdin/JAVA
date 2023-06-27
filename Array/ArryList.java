import java.util.*;

public class ArryList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ArrayList");
        ArrayList<Integer> myList = new ArrayList<>(3);
        myList.add(76);
        myList.add(22);
        myList.add(52);
        myList.add(25);
        myList.add(2);
        myList.add(13); // adding elements
        System.out.println(myList);

        ArrayList<Integer> myList1 = new ArrayList<>(1);

        // taking input from user

        System.out.println("Enter the number");
        for (int i = 0; i < 10; i++) {
            myList1.add(in.nextInt());
        }

        // printing output normally

        System.out.println(myList1);

        myList1.set(2, 49); // changing the value at inde 2 and changed value is 49
        System.out.println(myList1);
        myList.remove(2); // removing the value at index 2


        // printing using for loops

        for (int i = 0; i <5; i++) {
            System.out.print(myList.get(i)+",");
        }

        System.out.println();
        
        System.out.println(myList1.contains(9)); //checking if yes then  it will return true
    }

}