package arraysProgram;

//write a program that prints the sum of each row in a 2d array
public class Excercise_6 {

    public static void main(String[] args)
    {
        int[][] num1 = { {1,2,3,4},
                {2,3,4,5},
                {33,4,55,66}
        };

        for(int i=0; i<num1.length; i++)
        {
            int sum=0;
            for(int j=0; j<num1[i].length; j++)
            {

                sum = sum + num1[i][j];

            }
            System.out.print(sum );
            System.out.println();
        }

    }
}
