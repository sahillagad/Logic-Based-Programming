package Logic_Based_Programming;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VALID_ZIP_CODE {


    public static void PinCodeValidation(String str){

             Pattern p=Pattern.compile("[0-9]{6}");
              Matcher m=p.matcher(str);
                    boolean b=m.matches();
              if(b==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }

    public static void main(String[] args) {


        PinCodeValidation("987650");
    }

}
