package Java.Maths;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int answer = countDigits(n);

        System.out.println("The total number of digits are: " + answer);
    }


    private static int countDigits(int n) {
        int totalDigits = 0;

        while(n != 0){
            System.out.println("Loop running");
            int quot = n / 10;
            int rem = n % 10;
            totalDigits = totalDigits + 1;
            n = quot;
        }
        return totalDigits;
    }

}
