package stringprogram;

//Print Each character of string in separate line

public class Excercise1 {

    public static void main(String[] args)
    {
        String s = new String("ITS SIMPLE");

        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            System.out.println(c);
        }
    }
}
