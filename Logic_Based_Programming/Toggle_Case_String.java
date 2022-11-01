package Logic_Based_Programming;

public class Toggle_Case_String {

    public static String ToggleCase(String str){

        String letter1 = "abcdefghijklmnopqrstuvwxyz";
        String letter2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String str2 = "";
        for (int i = 0; i < str.length(); i = i + 1) {
            char c = str.charAt(i);
            boolean output = true;
            for (int j = 0; j < letter1.length(); j = j + 1) {


                    if (c == letter1.charAt(j)) {

                        str2 = str2 + letter2.charAt(j);
                        output = false;
                    }
            }
            if (output == true) {
                str2 = str2 + str.charAt(i);
            }
        }


        return str2;
    }
    public static void main(String[] args) {

        String str="aBc12#";
        String str2=ToggleCase(str);
        System.out.println("Input  :- "+str);
        System.out.println("Output :- "+str2);
        System.out.println("------------------------");


        String str21="aBc12#";
        String str22=ToggleCase(str21);
        System.out.println("Input  :- "+str21);
        System.out.println("Output :- "+str22);

        System.out.println("------------------------");

        String str31="tu@kmiNi";
        String str32=ToggleCase(str31);
        System.out.println("Input  :- "+str31);
        System.out.println("Output :- "+str32);
    }
}
