package stringprogram;

//Write a program to reverse the String

import java.util.Scanner;

public class Excercise_8
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String name = scanner.next();
       String updatedname = "";

        //By using forloop
        for (int i = name.length() - 1; i >= 0; i--) {
         updatedname = updatedname + name.charAt(i);
        }
        System.out.println(updatedname);


    }
}
