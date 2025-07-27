package Java.Maths;

import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        boolean answer = isArmstrong(n);

        if(answer == true){
            System.out.println("The number is Armstrong");
            return;
        }
        System.out.println("The number is not Armstrong");
    }
    public static boolean isArmstrong(int n) {
        int newNum = 0;

        int temp = n;
        while(temp != 0){
            int quot = temp / 10;
            int rem = temp % 10;
            newNum = newNum + (int) Math.pow(rem,3);
            temp = quot;
        }

        if (newNum == n){
            return true;
        }
        return false;
    }
}
