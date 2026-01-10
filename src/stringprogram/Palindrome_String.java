package stringprogram;

import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String");
        String palindrome = scan.nextLine();

        System.out.println(palindrome.length());
        String reversePalindrome = "";
        int palindrome_length = palindrome.length();

        for(int i=palindrome_length-1; i>=0; i--)
        {
            reversePalindrome = reversePalindrome + palindrome.charAt(i);
            System.out.println(reversePalindrome);
        }

        if(palindrome.equals(reversePalindrome))
        {
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("String is not Palindrome");
        }
    }




}
