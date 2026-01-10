package stringprogram;

import java.util.Scanner;

public class Excercise_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String name = scanner.next();
        String revString = "";

        for (int i = name.length()-1; i >=0; i--)
        {
            revString = revString + name.charAt(i);
        }

        if(name.equals(revString))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }
}
