package Java.Patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();

        /*

        n = 3
        * * *
        * * * * *
        * * * * * * *

        n = 5
        * * * * *
        * * * * * * *
        * * * * * * * * *
        * * * * * * * * * * *
        * * * * * * * * * * * * *


         */

        // for i = 0, j = n times
        // for i = 1, j = n + 2
        // for i = 2, j = n + 2 + 2
        // for i = 3 , j = n + 2 + 2 + 2
        // for i = 4, j = n + 2 + 2 + 2 + 2

//        int col = n;
//
//        for(int i = 0; i < n; i++){
//
//            for(int j = 0; j < col; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//            col = col + 2;
//        }


        /*
        n = 5
        col = 5 * 3 - 2 = 13
         * * * * * * * * * * * * *
         * * * * * * * * * * *
         * * * * * * * * *
         * * * * * * *
         * * * * *

         n  = 3 , col = 3 * 3  - 2 , col = 7
         * * * * * * *
         * * * * *
         * * *

         */

        int col = n * 3 - 2;
        for( int i = 0; i < n; i++){
            for(int j = 0; j < col; j++){
                System.out.print("* ");
            }
            System.out.println();
            col=col-2;

        }



    }
}
