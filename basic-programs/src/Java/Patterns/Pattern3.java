package Java.Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {

        /*
        n = 5
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *

        n = 4
        * * * *
        * * * *
        * * * *
        * * * *

        n = 3
        * * *
        * * *
        * * *


         */

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();

//        // if n = 5 , i = 0, 1, 2, 3, 4 (on i = 5 it will exit)  (number of rows)
//        for(int i = 0 ; i < n; i++){ // it will run till the rows
//
//            // n = 5, j = 0, 1, 2, 3 ,4 (on j = 5 it will exit) (to print stars)
//            for(int j = 0; j < n; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }



        for(int i = 0; i< n; i++){
            for(int j = 0; j<n ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
