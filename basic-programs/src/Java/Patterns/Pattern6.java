package Java.Patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        /*

        n = 5
        * * * * *
        * * * *
        * * *
        * *
        *

        n = 4
        * * * *
        * * *
        * *
        *

        n = 3
        * * *
        * *
        *


         */


        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();

        for(int i=0; i<n; i++){
            for(int j = n-i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
