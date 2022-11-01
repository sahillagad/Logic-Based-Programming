package Logic_Based_Programming;

import java.util.Scanner;

public class Special_two_digit_number {

    public static void SpecialNumberCheck(int num){

        String str=Integer.toString(num);


         int n1=Integer.parseInt(String.valueOf(str.charAt(0)));
         int n2=Integer.parseInt(String.valueOf(str.charAt(1)));

         int sum=(n1+n2);
         int product=(n1*n2);

         if(num==(sum+product)){
             System.out.println(num+" is a Special Two-digit Number");
         }
         else{
             System.out.println(num+" is not a Special Two-digit Number");
         }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter TWO Digit Number");
        int num=sc.nextInt();
        if(num>=10 && num<=99){

            SpecialNumberCheck(num);
        }
        else {
            System.out.println("Invalid Number enter");
        }



    }
}
