package classroom;

public class ConditionalStatements {
    public static void main(String[] args) {
        //Conditional Statement in Java allows to control the flow of your program based on certain conditions.

        //'If' statement

        /*
        if(condition) {
        Code to be executed if the condition is TRUE!
         */

        if (true) {
            System.out.println("This code is executed!");
        }

        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }

        if (x > 12) {
            System.out.println("x is greater than 12");
        }

        //Will not be executed because isSpring is false
        boolean isSpring = false;
        if (isSpring) {
            System.out.println("It is Spring!");
        }

        //Invert statement to execute what wasn't executing before (use !)
        boolean isItSpring = false;
        if (!isSpring) {
            System.out.println("It is Spring!");
        }

        //What returns true or false
        //Comparison: >, <, ==, >=, <=, /=

        // IF-ELSE
        //Child: <= 12 age;
        //Teenager: >= 13 $ <=19;
        //Adult: >= 20 & <= 59;
        //Else: Senior;
        int age = 25;

        if (age <= 12) {
            System.out.println("This is child!");
        } else {
            System.out.println("Something else!");
        }

        //IF-ELSE-IF-ELSE
        // age = 25

        if (age <= 12) {
            System.out.println("This is child!");
        } else if (age >= 13 && age <= 19) {
            System.out.println("This is teenager!");
        } else if (age >= 20 && age <= 59) {
            System.out.println("This is adult!");
        } else {
            System.out.println("This is senior!");
        }

        //Write a Java program that checks if a given number is positive, negative or zero.
        //Define variable (int number = 10);
        //Create logic if (number >,<,= 0)
        //For each condition print out message (is positive, is negative, is zero)

        int number = 10;
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else if (number == 0) {
            System.out.println("Zero");
        }

        //Write a Java program that determines the time of the day based on given hour:
        //If the hour is between 0 and 11, will print: Good morning
        //If the hour is between 12 and 17, will print: Good afternoon
        //If the hour is between 18 and 23, will print: Good evening
        //In all other cases should say: Invalid hour provided

        int hour = 20;
        if (hour >= 0 && hour <= 11) {
            System.out.println("Good morning");
        } else if (hour >= 12 && hour <= 17) {
            System.out.println("Good afternoon");
        } else if (hour >= 18 && hour <= 23) {
            System.out.println("Good evening");
        } else {
            System.out.println("Invalid hour provided");
        }
    }
}
