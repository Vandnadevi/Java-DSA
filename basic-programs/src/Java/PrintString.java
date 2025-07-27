package Java;

import java.util.Scanner;

public class PrintString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the line: ");
        String input = scn.nextLine();

        System.out.println("The input is: ");
        System.out.println(input);
    }
}
