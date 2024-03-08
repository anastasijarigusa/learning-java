package classroom;

public class LearnString {
    public static void main(String[] args) {
        //String
        String name = "Anastasija";
        String lastName = "Rigusa";
        System.out.println(name);
        System.out.println(lastName);

        //Exercise: Print name and surname
        //Concatenation
        String fullName = name + " " + lastName; //Anastasija Rigusa
        System.out.println(fullName);

        //Same example
        System.out.println(name + " " + lastName);
        System.out.println(String.format("%s %s",name, lastName));

        //Can save into variable
        String myFullName = String.format("%s %s",name, lastName);
        System.out.println(myFullName);

        //Hello, world!
        String hello = "Hello, ";
        String world = "world!";

        String helloWorld = hello.concat(world);
        System.out.println(helloWorld);

        //Exercise:
        //Declare a string variable with your name
        //Declare a string variable with your favouring programming language
        //Concatenate the two strings to form a message "My Name is {NAME}. I love coding in {PLANGUAGE}"
        //Print it out
        String myName = "My name is Anastasija. ";
        String planguage = "I love coding in Java.";
        String message = myName.concat(planguage);
        System.out.println(message);

        String randomString = "some text";
        System.out.println(randomString.toUpperCase());
    }
}
