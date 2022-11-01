package Logic_Based_Programming;

public class Valid_Hex_Code {

    public static void CheckValid(String str){


        boolean b=false;
        for (int i=0;i<str.length();i=i+1){
            if(str.charAt(i)=='#'){

                b=true;
                break;
            }
        }

        if (b==true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }


    }

    public static void main(String[] args) {

        CheckValid("#F00");
        CheckValid("#1AFFa1");
        CheckValid("123456");


    }
}
