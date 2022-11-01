package Logic_Based_Programming;

public class CheckOnlyDigits {


   public static void CheckDigit(String str){


       try {

            int x=Integer.parseInt(str);
           System.out.println("The given string contains only digits so that output is true.");

       }
       catch (NumberFormatException e){

           System.out.println("The given string contains alphabet character and digits so that output is false.  ");
       }

   }


    public static void main(String[] args) {

       CheckDigit("1234");
       CheckDigit("GeeksforGeeks2020");


    }


}
