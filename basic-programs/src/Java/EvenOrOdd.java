package Java;


import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);


        System.out.println("Enter a integer: ");
        int input = scn.nextInt();

        boolean ans = checkEvenOrOdd(input);

        if(ans == true){
            System.out.println("Tne input is even");
        }
        else{
            System.out.printf("THe input is odd");
        }
//        System.out.println("step 1- get scanner ready");
//        Scanner scn = new Scanner(System.in);
//
//        System.out.println("Enter any number: ");
//        int a = scn.nextInt();
//        System.out.println("Input got scanned by scn object ");
//
//        System.out.println("Going to get answer of even or odd. Calling a function");
//        boolean answer = checkEvenOdd(a);   // checkEvenOdd will get result of number true if it is even else false
//        System.out.println("Answer stored in boolean, now i will check condtion if answer is true or not");
//        // answer = true
//        if (answer == true){
//            System.out.println("The number " + a + " is even");
//        }
//        else{ // answer = false
//            System.out.println("The number " + a + " is odd");
//        }
//    }
//    private static boolean checkEvenOdd(int num){
//
//        System.out.println("We are in fucntion now");
//        System.out.println("Checking codition of even or odd");
//        if( num % 2 == 0 ){
//            System.out.println("The condtion true and i am returing with true");
//            return true;
//        }
//        System.out.println("The condition was not true and now i am returning with false;");
//        return false;
    }

    private static boolean checkEvenOrOdd(int input) {

        if( input % 2 == 0){
            return true;  // it is divided by 2
        }
        return false;// it is not exactly divisible by 2
    }
}
