package homework;

public class FirstHomeWork {
    public static void main(String[] args) {

    //Task 1. Easy peasy.

        int a = 2;
            if (a > 0) {
                System.out.println("1. " + a + " is Positive number");
            }
            else
                System.out.println("1. " + a + " is Negative number");

    //Task 2. Odd or even.

        int b = 180;
            if (b%2==0) {
                System.out.println("2. " + b + " is Even number");
            }
            else
                System.out.println("2. " + b + " is Odd number");

    //Task 3. Age group classifier

        int age = 17;
            if (age <= 17) {
                System.out.println("3. " + age + "y.o is Teenager");
            }
            else
                System.out.println("3. " + age + "y.o is Adult");

    //Task 4. Leap year checker
        
        int year = 1900;
        boolean leap = true;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if (leap)
            System.out.println("4. " + year + " is Leap year");
        else
            System.out.println("4. " + year + " is not Leap year");


    //Task 5. Multiple conditions

        int number = 42;
            if (number > 0 && number %2==0 && number < 100) {
                System.out.println("5. " + number + " is Valid number");
            }
            else
                System.out.println("5. " + number + " is not Valid number");

    //Task 6. Nested conditions

        int q = 50;
             if (q > 0 && q%2==0) {
                System.out.println("6. " + q + " is Positive and Even");
             }
             else if (q < 0 && q%2==0) {
                System.out.println("6. " + q + " is NOT Positive but Even");
             }
             else if (q < 0 && q%2!=0) {
                 System.out.println("6. " + q + " is NOT Positive and NOT Even");
             }
             else
                System.out.println("6. " + q + " is Positive but NOT Even");

    //Task 7. Character type identifier

        char ch = 'n';
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("7. '" + ch + "' is Vowel");
            }
            else
                System.out.println("7. '" + ch + "' is not Vowel");

    //Task 8. BMI calculator

        int w = 80;
        int h = 2;
        int y = w / (h * h);
            if (y <= 18) {
                System.out.println("8. BMI " + y + " is Underweight");
            }
            else if (y >= 19 && y <= 24) {
                System.out.println("8. BMI " + y + " is Healthy Weight");
            }
            else if (y >= 25 && y <= 30) {
                System.out.println("8. BMI " + y + " is Overweight");
            }
            else
                System.out.println("8. BMI " + y + " is Obesity");

    //Task 9. Final grade

        int m = 85;
        int s = 59;
        int e = 97;
        int avg = (m+s+e)/3;
            if (avg < 60) {
                System.out.println("9. Final grade is F - " + avg + " average score");
            }
            else if (avg >= 60 && avg <= 69) {
                System.out.println("9. Final grade is D - " + avg + " average score");
            }
            else if (avg >= 70 && avg <= 79) {
                System.out.println("9. Final grade is C - " + avg + " average score");
            }
            else if (avg >= 80 && avg <= 89) {
                System.out.println("9. Final grade is B - " + avg + " average score");
            }
            else
                System.out.println("9. Final grade is A - " + avg + " average score");

    //Task 10. File extension checker

        String file = "javacode.pdf";
        if (file.endsWith(".doc")) {
            System.out.println("10. Valid file extension - " + file);
        }
        else if (file.endsWith(".txt")) {
            System.out.println("10. Valid file extension - " + file);
        }
        else if (file.endsWith(".pdf")) {
            System.out.println("10. Valid file extension - " + file);
        }
        else
            System.out.println("10. Invalid file extension - " + file);
    }
}