package stringprogram;

//Create a string with no spaces

public class Excercise_7 {
    public static void main(String[] args) {
        String s = new String("NO26 Sound");
        String s1 = "";
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if (!Character.isWhitespace(c)) {
                s1 = s1 + c;
            }
        }
        
        System.out.println(s1);
    }
}
