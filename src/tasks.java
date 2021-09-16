import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;  // used for task 4 (not sure if redundant?)

public class tasks {
    static Scanner scanner = new Scanner(System.in);

         /////////////
        // METHODS //
       /////////////

        // Task 1 //
    /*public static void smallestNumber(int firstNumber, int secondNumber, int thirdNumber){
        if (firstNumber < secondNumber && firstNumber < thirdNumber){
            System.out.println("The smallest value is " + firstNumber);
        }
        else if (secondNumber < firstNumber && secondNumber < thirdNumber){
            System.out.println("The smallest value is " + secondNumber);
        }
        else if (thirdNumber < firstNumber && thirdNumber < secondNumber){
            System.out.println("The smallest value is " + thirdNumber);
        }
    }*/
        // Task 2 //
    /*public static void numberIdentifier(int userNumber){
        if (userNumber == 0){
            System.out.println("The number is 0");
        }
        else if (userNumber > 0){
            System.out.println("The number is positive");
        }
        else if (userNumber < 0){
            System.out.println("The number is negative");
        }
    }*/
        // Task 3 //
    /*public static void getMiddle(String userString){
        int lengthOfString = userString.length();
        int middleOfString = lengthOfString / 2;

        if(lengthOfString % 2 == 0){
            System.out.println("The two middle characters are: " + userString.charAt(middleOfString - 1) + userString.charAt(middleOfString));
        }
        else if(userString.charAt(middleOfString) == ' '){
            System.out.println("The middle character is empty");
        }
        else{
            System.out.println("The middle character is: " + userString.charAt((middleOfString)));
        }
    }*/
        // Task 4 //
    /*public static double areaOfTriangle(double firstSide, double secondSide, double thirdSide){
        double sidesDividedByTwo = (firstSide + secondSide + thirdSide) / 2;
        // Making variable name shorter for convenience
        double sDBT = sidesDividedByTwo;

        double areaOfTheTriangle = Math.sqrt(sDBT*(sDBT - firstSide)*(sDBT - secondSide)*(sDBT-thirdSide));

        return areaOfTheTriangle;
    }*/
        // Task 5 //
    /*public static boolean passwordChecker(String password){
        String notAllowed = "secret";
        boolean isPasswordValid = true;

            int lengthOfPassword = password.length();
            char firstLetter = password.charAt(0);

            if (lengthOfPassword < 8) {
                System.out.println("The password must have at least 8 characters.");
                isPasswordValid = false;
                return isPasswordValid;
            }
            else if (lengthOfPassword > 8 && password.toLowerCase().matches(".*[a-z].*") && password.matches(".*[0-9].*")) {
                isPasswordValid = true;
                return isPasswordValid;
            }
            else if (password.contains(notAllowed)){
                System.out.println("The password cannot contain \"secret\".");
                isPasswordValid = false;
                return isPasswordValid;
            }
            else if (firstLetter == '-'){
                System.out.println("The first character must not be a dash.");
                isPasswordValid = false;
                return isPasswordValid;

            }
            else {
                System.out.println("Password may only contain digits and letters.");
                isPasswordValid = false;
                return isPasswordValid;
            }

    }*/
        // Task 6 //
    /*public static void printNumbers(int maximum){
        for (int i = 1; i <= maximum; i++) {
            System.out.print("[" + i + "]");
        }
        System.out.println("\n");
    }*/
        // Task 6 //
       //   ALT  //
    /*public static void printNumbers(){
        int maximum;
        boolean continueOr = true;

        while(continueOr) {
            maximum = scanner.nextInt();
            if (maximum > 0) {
                for (int i = 1; i <= maximum; i++) {
                    System.out.print("[" + i + "]");
                }
                continueOr = false;
            } else {
                System.out.println("Try inputting a positive number: ");
            }
        }
    }*/

    public static void main(String[] args) {
        // Task 1 //
        /*int firstInput;
        int secondInput;
        int thirdInput;

        System.out.println("Enter three numbers:");
        firstInput = scanner.nextInt();
        secondInput = scanner.nextInt();
        thirdInput = scanner.nextInt();
        smallestNumber(firstInput, secondInput, thirdInput);*/
        // Task 2 //
        /*int userInput;

        System.out.println("Enter a number: ");
        userInput = scanner.nextInt();
        numberIdentifier(userInput);*/
        // Task 3 //
        /*String userInput;

        System.out.println("Enter a string: ");
        userInput = scanner.nextLine();
        getMiddle(userInput);*/
        // Task 4 //
        /*double firstInput;
        double secondInput;
        double thirdInput;

        // Getting lengths
        System.out.println("Enter length of first side: ");
        firstInput = scanner.nextDouble();
        System.out.println("Enter length of second side: ");
        secondInput = scanner.nextDouble();
        System.out.println("Enter length of the third side: ");
        thirdInput = scanner.nextDouble();
        // Calling method
        System.out.println(areaOfTriangle(firstInput, secondInput, thirdInput));*/
        // Task 5 //
        /*String userPassword;

        System.out.println("Enter a password: ");
        userPassword = scanner.nextLine();
        System.out.println(passwordChecker(userPassword));*/
        // Task 6 //
        /*printNumbers(15);
        printNumbers(5);*/
        // Task 6 //
        //   ALT  //
        /*
        System.out.println("Enter a number: ");
        printNumbers();*/

    }
}
