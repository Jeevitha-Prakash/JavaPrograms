import java.util.Scanner;

public class Excercise_4 {

    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of coloumns");
        int coloumns = sc.nextInt();

        for (int i = 0; i < rows; i++) {

            //spaces
            for(int k=rows-1; k>i; k--)
            {
                System.out.print(" ");
            }

            //stars
            for(int j=0;j<(2*i+1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        }
}
