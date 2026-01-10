package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfEachElementInAnArray
{

    public static void main(String[] args)
    {
        //Creation of array by user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = scanner.nextInt();

        int[] number = new int[size];

        for(int i=0; i<size; i++)
        {
            System.out.println("Enter the element of an Array");
                  number[i] = scanner.nextInt();
        }

        //Using HashMap to find the Frequency
        HashMap<Integer, Integer> hashmap = new HashMap<>();

        //Transvering through array and storing the object along with its Frequency in HashMap

        for(int i=0; i<size; i++)
        {
            if(hashmap.containsKey(number[i]))
            {
                hashmap.put(number[i],hashmap.get(number[i])+1);
            }
            else
            {
                hashmap.put(number[i],1);
            }
        }

        //For Priniting the values
        for(Map.Entry<Integer,Integer> numbers : hashmap.entrySet())
        {
            System.out.println(numbers.getKey() + " " + numbers.getValue());
        }




    }
}
