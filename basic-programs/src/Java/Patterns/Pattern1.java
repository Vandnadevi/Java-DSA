package Java.Patterns;


import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {


        /*

         * ** * ** * ** * ** * **

         */
//
//        for(int i = 0; i < 5; i++){
//            System.out.print("* ");
//            System.out.print("** ");
//        }


        /*

 a = 5
         * * * * *



b = 6   * * * * * *

         */




        // iterate till a times . agar a = 5 to loop 5 baar chalna chahiyr
        // 0,1,2,3,4,5
//        for(int i=0; i < 5; i++){
//            System.out.print("* ");
//        }
//
//        System.out.println();
//        System.out.println();
//
//        for(int i = 0; i < 6; i++){
//            System.out.print("* ");
//        }


        // take input a
        // take input b

        // run for loop till a and print "a" number of stars

        // space of 1 line

        // then again run loop till b , print stars 'b' times

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < a; i++){
            System.out.print("* ");
        }

       System.out.println();
        System.out.println();

        for(int i = 0; i < b; i++){
            System.out.print("* ");
        }
    }
    }
