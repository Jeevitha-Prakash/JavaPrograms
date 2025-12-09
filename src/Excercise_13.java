import java.util.Scanner;

public class Excercise_13 {


    public void diamondPattern()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and the coloum");
        int rows = sc.nextInt();
        int col = sc.nextInt();

        for(int i=1; i<=rows; i++)
        {
            //spaces
            for(int k=rows; k>i; k--)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=rows; i++)
        {
            //spaces
            for(int k=1; k<=i; k++)
            {
                System.out.print(" ");
            }
            for(int j=col; j>=(2*i+1); j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void main(String[] args)
    {
        Excercise_13 e = new Excercise_13();
        e.diamondPattern();
    }
}
