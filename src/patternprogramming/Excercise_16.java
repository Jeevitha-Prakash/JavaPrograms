package patternprogramming;

import java.util.Scanner;

public class Excercise_16 {
    int rows;
    int cols;
    public void numberIncreasingReversePyramid(int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;

        for(int i=rows; i>=1; i--)
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

        Excercise_16 ex = new Excercise_16();
        ex.numberIncreasingReversePyramid(rows, cols);


    }
}
