package stringprogram;

//Print only uppercase character

public class Excercise_3 {

    public static void main(String[] args) {
        String s = new String("ITS SIMPLE");

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                System.out.println(c);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int ascii = (int)c;
            if(ascii>=65 && ascii<=90) {
                System.out.println(c);
            }
        }

    }
}
