package Java;

import java.util.Scanner;

public class MaxMIn {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter first number: ");
        int a = scn.nextInt();

        System.out.println("enter second number: ");
        int b = scn.nextInt();

//        if( a > b){
//            System.out.println("First number is grater than second");
//        }
//        else if(a < b){
//            System.out.println("First is less than second");
//        }
//        else{
//            System.out.println("both are equal");
//        }

//        int c = 0;
//
//        if (a > b) {
//            c = a;
//        }
//        else{
//            c = b;
//        }
//        System.out.println("The larger among two is: " + c);

        int c = Math.max(a, b);
        System.out.println("The larger among two is: " + c);

        int smaller = Math.min(a, b);
        System.out.println("the smaller among two is: " + smaller);
    }
}
