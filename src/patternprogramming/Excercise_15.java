package patternprogramming;

import java.util.Scanner;

public class Excercise_15 {
int rows;
int cols;
    public void numberIncreasingPyramid(int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;

        for(int i=1; i<=rows; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        Excercise_15 ex = new Excercise_15();
        ex.numberIncreasingPyramid(rows, cols);


    }
}
