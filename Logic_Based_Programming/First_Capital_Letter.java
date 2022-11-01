package Logic_Based_Programming;

import java.util.Scanner;

public class First_Capital_Letter {

    public static String MakeFirstLetterCapital(String str) {


        String letter1 = "abcdefghijklmnopqrstuvwxyz";
        String letter2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


        String str2 = "";
        for (int i = 0; i < str.length(); i = i + 1) {
            char c = str.charAt(i);
            boolean output = true;
            for (int j = 0; j < letter1.length(); j = j + 1) {

                if (i == 0) {
                    if (c == letter1.charAt(j)) {

                        str2 = str2 + letter2.charAt(j);
                        output = false;
                    }
                }
                else if (i>0) {
                    if (c == letter2.charAt(j)) {

                        str2 = str2 + letter1.charAt(j);
                        output = false;
                    }

                }

            }
            if (output == true) {
                str2 = str2 + str.charAt(i);
            }
        }


        return str2;
    }






    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.next();
        String str1=MakeFirstLetterCapital(str);
        System.out.println(str1);






    }
}
