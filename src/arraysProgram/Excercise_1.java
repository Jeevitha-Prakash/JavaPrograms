package arraysProgram;

//Print all the elements of array in separate line

import java.util.Scanner;

public class Excercise_1 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        System.out.println("Enter the elements of an Array");

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = sc.nextInt();
        }

        for(int i=0; i<numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }



    }
}
