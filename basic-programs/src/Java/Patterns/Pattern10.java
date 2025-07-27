package Java.Patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        /*

         n = 5
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
         */


        int number = 1;
        for(int i = 0; i < n; i++){

            for(int j = 0; j < i + 1; j ++){
                System.out.print(number + " ");
                number = number + 1;
            }

            System.out.println();
        }
    }
}
