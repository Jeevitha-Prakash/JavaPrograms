package arraysProgram;

import java.util.Scanner;

//Print all the number from even index in an array
public class Excercise_3 {

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

            if((i % 2) ==0)
                System.out.println("Number at even index : " + numbers[i] + " ");
        }


    }
}
