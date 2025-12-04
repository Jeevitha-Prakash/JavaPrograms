package stringprogram;

//Create a new String containg only upper character

public class Excercise_5 {
    public static void main(String[] args) {
        String sn = "";
        String s = new String("Its SimPlE");

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                sn = sn + c;
                System.out.println(sn);
            }
        }
        System.out.println(sn);
    }
}
