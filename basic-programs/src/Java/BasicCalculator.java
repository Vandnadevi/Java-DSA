package Java;

import java.util.Scanner;
import java.lang.Math;

public class BasicCalculator {
    public static void main(String[] args) {
       // taking input from user
        Scanner scn =new Scanner(System.in);

        System.out.println("Enter first number:");


//
//        Long a = scn.nextLong();
//
//        System.out.println("Scanned value of a is: " + a);

//        System.out.println("Enter second number: ");

        int a = scn.nextInt();
        System.out.println("Enter second number: ");
//
        int  b = scn.nextInt();

        //basic operations of calculator

        int sum = a + b;
        int multiply = a * b;
        double divide =   ((double) a / b);
//        divide = Math.ceil(divide);

        divide = Math.floor(divide);
        int difference = a - b;
        difference = Math.abs(difference);




//        int difference = 0;


        /*
        1. a is grater than b
        2. b is grater than a
        3. a is equal to b
       */

//        if(a > b){
//            difference = a - b;
//        }
//        else{
//            difference = b - a;
//        }

        // what if a = b;




        System.out.println("The sum is :"+ sum );
        System.out.println("The multiplication is :"+ multiply );
        System.out.println("The division  is :"+ divide );
       System.out.println("The difference is :" + difference);

    }
}
