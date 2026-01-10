package stringprogram;

//Create a string having digit first followed by character

public class Excercise_6 {
    public static void main(String[] args) {
        String s = new String("NO26 Sound");
        String s1 = "", n1 ="";
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);

            if(Character.isDigit(c))
            {
                n1 =n1+c;
            }
            if(Character.isUpperCase(c))
            {
                s1 = s1+c;
            }
        }
        String s2 = n1+s1;
        System.out.println(s2);
    }
}
