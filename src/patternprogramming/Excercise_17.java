package patternprogramming;

import java.util.Scanner;

public class Excercise_17 {
    int num;

    public void numberChangingPyramid(int num)
    {
        this.num = num;
        int count =1;
        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of pyramid");
        int num = sc.nextInt();


        Excercise_17 ex = new Excercise_17();
        ex.numberChangingPyramid(num);


    }
}
