import java.util.Scanner;

public class Excercise_5 {
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of coloumns");
        int coloumns = sc.nextInt();

        for (int i = 0; i < rows; i++) {

            //spaces
            for(int k=0; k<=i; k++)
            {
                System.out.print(" ");
            }

            //stars
            for(int j=coloumns-1; j>(2*i-1); j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
