package patternprogramming;

import java.util.Scanner;

public class Excercise_19 {
    int num;

    public void palindomeTrianglePattern(int num)
    {
        this.num = num;

        for(int i=1; i<=num; i++)
        {
            for(int k=num; k>i; k--)
            {
                System.out.print("  ");
            }
            for(int j=i; j>=1; j--)
            {
                System.out.print( j + " ");
            }
            for(int j=2; j<=i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of pyramid");
        int num = sc.nextInt();


        Excercise_19 ex = new Excercise_19();
        ex.palindomeTrianglePattern(num);


    }
}
