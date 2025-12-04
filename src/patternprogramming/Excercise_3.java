package patternprogramming;

import java.util.Scanner;

public class Excercise_3 {

    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of coloumns");
        int coloumns = sc.nextInt();
        for(int i=0; i<rows;i++)
        {
            for (int j = rows - 1; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
