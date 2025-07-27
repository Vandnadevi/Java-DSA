package Java.Patterns;

import java.util.Scanner;

public class pattern9 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//       n= 4
//        1
//        2 2
//        3 3 3
//        4 4 4 4

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print(i+1+" ");
            }
            System.out.println();

        }

    }
}
