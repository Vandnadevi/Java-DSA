package Java.Maths;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int answer = reverseNumber(n);

        System.out.println("The reverse of number is: " + answer);
    }

    private static int reverseNumber(int n) {
        int rev = 0;

        while (n != 0){
            int quot = n / 10;
            int rem = n % 10;
            rev = (rev *10) + rem;
            n = quot;
        }

        return rev;
    }
}
