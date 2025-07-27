package Java.Patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
       int number = 0;
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            if(i%2==0){
                number = 1;
            }
            else{
                number = 0;
            }
            for (int j=0;j<i+1;j++) {
                System.out.print(number+" ");
                number = 1-number;
            }
            System.out.println( );
        }


    }
}
