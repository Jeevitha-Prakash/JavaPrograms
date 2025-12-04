package arraysProgram;

//Print only the even numbers in an array in separate line

import java.util.Scanner;

public class Excercise_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        System.out.println("Enter the elements of an Array");

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {

            if((numbers[i] % 2) ==0)
            System.out.println("Even number of elements are : " + numbers[i] + " ");
        }


    }
}
