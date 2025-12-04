package patternprogramming;

import java.util.Scanner;

public class Excercise_18 {

    int num;

    public void zeroOneTriangle(int num)
    {
        this.num = num;

        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=i; j++)
            if((i+j)%2 == 0)
            {
                System.out.print("1 ");
            }
            else
            {
                System.out.print("0 ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of pyramid");
        int num = sc.nextInt();


        Excercise_18 ex = new Excercise_18();
        ex.zeroOneTriangle(num);


    }
}
