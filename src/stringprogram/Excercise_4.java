package stringprogram;

//count the uppercase and lowercase character of a string
public class Excercise_4 {
    public static void main(String[] args) {
        String s = new String("ITS SIMPLE");
        int count=0;
        int countl =0;
//        for(int i=0; i<s.length(); i++)
//        {
//            char c = s.charAt(i);
//            if(Character.isUpperCase(c))
//            {
//                count++;
//            }
//            if(Character.isLowerCase(c))
//            {
//                countl++;
//            }
//        }

        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            int ascii = (int)c;
            if(ascii>=65 && ascii<=90)
            {
                count++;
            }
                if(ascii>=97 && ascii<=122)
                {
                    countl++;
                }
       }
        System.out.println("Upper case count : " + count);
        System.out.println("Lower case count : " + countl);
    }
}