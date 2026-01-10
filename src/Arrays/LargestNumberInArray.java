package Arrays;

public class LargestNumberInArray
{
    public static void main(String[] args) {

        int[] number = {11,22,3,4,5};
        int max = number[0];

        for(int i=0; i<number.length; i++)
        {
            if(number[i]>max)
            {
                max = number[i];
            }
        }
        System.out.println("Maximum element in array is :" + max);
    }
}
