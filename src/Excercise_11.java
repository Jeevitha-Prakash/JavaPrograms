import java.util.Scanner;

public class Excercise_11 {
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of coloumns");
        int coloumns = sc.nextInt();

        for (int i = 1; i <= rows; i++) {

            //spaces
            for(int k=rows; k>=i; k--)
            {
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=(2*i-1); j++)
            {
                if(j==1 || j ==(2*i-1) || i==rows)
                {
                    System.out.print("*");
                }
                else {

                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
