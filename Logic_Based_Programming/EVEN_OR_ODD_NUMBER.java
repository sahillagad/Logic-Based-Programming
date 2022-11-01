package Logic_Based_Programming;

import java.util.Scanner;

public class EVEN_OR_ODD_NUMBER {


    public static String  Even_Odd(int num){
     String result="Odd Number";

     if(num%2==0) {
         result = "Even Number";
     }
     return  result;
    }








    public static void main(String[] args) {

        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String s=Even_Odd(n);

        System.out.println(s);





    }
}
