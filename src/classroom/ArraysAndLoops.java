package classroom;

import java.util.Arrays;

public class ArraysAndLoops {
    public static void main(String[] args) {
        //Array
        //Bread; Milk; Eggs; Fruits;
        String[] shoppingList = {"Bread", "Milk", "Eggs", "Fruits"};
        int[] grades = {7, 9, 10, 6, 5, 4};
        String[] seasons = {"Summer", "Winter", "Autumn", "Spring"};

        String eggs = shoppingList[2];
        System.out.println(eggs);

        System.out.println(grades[4]);

        grades[0] = 2;
        System.out.println(grades[0]);
        //Print all grates
        System.out.println(Arrays.toString(grades));

        // Create empty array;
        int[] emptyArray = new int[4];
        // [0] [0] [0] [0]
        System.out.println(Arrays.toString(emptyArray));
        emptyArray[0] = 1;
        emptyArray[1] = 2;
        emptyArray[2] = 3;
        emptyArray[3] = 4;
        System.out.println(Arrays.toString(emptyArray));

        //Create String array with names;
        //Name count should be S;
        //And print them all;
        String[] names = {"Alla", "Edgars", "Ieva", "Marks", "Tatjana"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        //System.out.println(Arrays.toString(names));

//        int[] namess = {5,10,15,20,25};
//        System.out.println(Arrays.toString(namess));

        //Create empty double array with size of 5
        //Print empty array
        //Update each array value from 0 to a number of your choice
        double[] doubleArray = new double[5];
        System.out.println(Arrays.toString(doubleArray));
        doubleArray[0] = 5.1;
        doubleArray[1] = 10.2;
        doubleArray[2] = 15.3;
        doubleArray[3] = 20.4;
        doubleArray[4] = 25.5;
        System.out.println(Arrays.toString(doubleArray));

        //Loops
        //Print number from 0 to 10;

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        //Calculate sum from 1 to 100;
        //Example: 1+2+3+4+n;
        int summa = 0;
        for (int i = 1; i <= 100; i++) {
            summa = summa + i;
        }
        System.out.println("Sum: " + summa);

        //civic: kayak

        //for
        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println(shoppingList[i]);
        }

        //i=0, (counter)
        //check, if i<shoppingList length (4);
        //i=i+1;

        //1 iteration  System.out.println(shoppingList[0])
        //Print = Bread;
        //i=1

        //2 iteration  System.out.println(shoppingList[1])
        //Print = Milk;
        //i=2

        for (String s : shoppingList) {
            System.out.println(s);
        }
        // print numbers from 10 to 0

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        int counter = 10;
        while (counter >= 0) {
            System.out.println(counter);
            counter = counter - 1;
        }

        //Exercise - Print even numbers from 2 to 100
        // Print in one line all the numbers
        //Variant 1
        for (int b = 2; b <= 100; b++)
            if (b % 2 == 0) {
                System.out.print(b + " ");
            }

        System.out.println(" ");

        //Variant 2
        for (int b = 2; b <= 100; b = b + 2) {
            System.out.print(b + " ");
        }


    }
}
