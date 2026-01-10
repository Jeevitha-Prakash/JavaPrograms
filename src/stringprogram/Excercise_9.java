package stringprogram;

//Write a program to reverse the case in the Word

import java.util.Scanner;

public class Excercise_9
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String name = scanner.next();
        String s ="";
       for(int i=0; i<name.length();i++)
       {
           char c = name.charAt(i);

           if (Character.isUpperCase(c)) {

             s= s +  Character.toLowerCase(c);
           }
           else
           {
               s= s +    Character.toUpperCase(c);
           }

       }
        System.out.print(s);
    }
}
