package Problem2;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.print((2 * i + 1) + (i < a - 1 ? ", " : ""));
        }
    }
}
