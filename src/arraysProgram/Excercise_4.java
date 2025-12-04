package arraysProgram;

//Print all the even numbers followed by odd numbers in an array

public class Excercise_4 {

    public static void main(String[] args)
    {
        int[] numbers = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
