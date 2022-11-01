package Logic_Based_Programming;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_validation {

    public static boolean Check_Validation(String email){

        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(email);
       boolean b=  matcher.matches();
        return  b;
    }


    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Email Id");
        String email=sc.next();

        boolean result=Check_Validation(email);

        if(result==true){
            System.out.println("valid Email Id");
        }
        else{
            System.out.println("Not valid Email Id");
        }

    }
}
