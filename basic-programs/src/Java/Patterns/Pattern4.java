package Java.Patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {

        /*
        n = 5
        *
        * *
        * * *
        * * * *
        * * * * *

        n = 4
        *
        * *
        * * *
        * * * *

        n = 3
        *
        * *
        * * *

         */


        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
         int n = sc.nextInt();
         for(int i = 0; i < n ;i++){
             for(int j = 0; j <= i; j++ ){
                 System.out.print("* ");
             }
             System.out.println();
         }




    }
}
