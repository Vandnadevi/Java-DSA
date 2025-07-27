package Java.Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {

        /*

        n = 5

        * *
        * * *
        * * * *
        * * * * *
        * * * * * *

         n = 4
        * *
        * * *
        * * * *
        * * * * *


         */


        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();

        // number of rows
        for(int i = 0; i < n; i++){

            // to print stars
            for(int j = 0; j < i + 2; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
