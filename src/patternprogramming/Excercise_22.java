package patternprogramming;

import java.util.Scanner;

public class Excercise_22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scanner.nextInt();

        for (int i = 1; i < n; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        for (int i = n ; i >= 1; i--)
        {
            for (int j = 1; j< i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i ; k <=n ; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }


    }
}
