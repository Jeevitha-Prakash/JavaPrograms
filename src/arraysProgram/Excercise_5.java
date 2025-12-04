package arraysProgram;

//Print all the 2 digits numbers in an array
public class Excercise_5 {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 88, 99, 109, 87};
        for (int i = 0; i < numbers.length; i++) {

            if ((numbers[i]) >=10 && numbers[i] <= 99) {
                System.out.println(numbers[i] );
            }

        }
    }
}
