package Java;

import java.util.Scanner;

public class TakeInputAndPrint {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in)
        // TAKING INPUT OF STRINGS


        // one word at a time
//        String inputString = scn.next();   // variable name is in camelCase

//        System.out.print("Enter your name: ");
//        String input_string = scn.next();
//        // next() only takes one word in a line
//        System.out.println("Your name is: " + input_string);



        // If we have to take whole line input
//        System.out.println("Enter a line about yourself- ");  // execute before taking input
//        String wholeLineInput = scn.nextLine(); // it will take the input
//        System.out.println("Your entered: " + wholeLineInput); // it will print the input taken

        // take input of numbers (int)

//        System.out.print("Enter first number: ");
//        int num1 = scn.nextInt();
//        System.out.print("Enter second number: ");
//        int num2 = scn.nextInt();
//
//        System.out.println("The entered numbers are: " + num1 + " and " + num2);


        // Take input of  boolean

//        System.out.println("You are boy or girl (true/false): ");
//        boolean isBoy = scn.nextBoolean();
//        System.out.println("OH! You are a boy? " + isBoy);

//        System.out.println("Enter a number: ");
//        int aNumber = scn.nextInt();

        boolean answer = checkNumber(100);

        System.out.println("the is equal to 100 ? " + answer);
    }

    private static boolean checkNumber(int aNumber) {

        if(aNumber == 100){ //  anumber == 100 ? condition check here  ( if true it enter into this condition)
            return true;
        }

        return false;

    }
}
