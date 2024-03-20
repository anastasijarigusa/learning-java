package classroom;

import java.util.Scanner;

public class Asker {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What is your name?");
        String answer = reader.nextLine();
        if (answer.equals("John")) {
            System.out.println(answer + ", you are not allowed here!!!");
        } else {
            System.out.println("Welcome, " + answer);
        }


    }
}
