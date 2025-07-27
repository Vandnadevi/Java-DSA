package Java.Maths;

import java.util.Scanner;

public class checkPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int answer = reverseNumber(n);

        if(answer == n){
            System.out.println("The number is Palindrome");
            return;
        }
        System.out.println("The number is not a Palindrome");

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
