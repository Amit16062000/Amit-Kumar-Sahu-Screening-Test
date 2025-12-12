package Probelm3;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();


        int limit = (a % 2 == 0) ? a - 1 : a;


        for(int i = 1;i <= (2 * limit - 1);i += 2) {
            System.out.print(i);
            if (i + 2 <= (2 * limit - 1)) {
                System.out.print(", ");
            }
        }
    }
}
