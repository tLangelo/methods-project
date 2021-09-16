import java.util.Scanner;

public class tasks {
    static Scanner scanner = new Scanner(System.in);


        // Task 1
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
        // Task 2
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
        // Task 3
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
        // Task 4


    public static void main(String[] args) {
        // Task 1
        /*int firstInput;
        int secondInput;
        int thirdInput;

        System.out.println("Enter three numbers:");
        firstInput = scanner.nextInt();
        secondInput = scanner.nextInt();
        thirdInput = scanner.nextInt();
        smallestNumber(firstInput, secondInput, thirdInput);*/
        // Task 2
        /*int userInput;

        System.out.println("Enter a number: ");
        userInput = scanner.nextInt();
        numberIdentifier(userInput);*/
        // Task 3
        /*String userInput;

        System.out.println("Enter a string: ");
        userInput = scanner.nextLine();
        getMiddle(userInput);*/
        // Task 4

    }
}
