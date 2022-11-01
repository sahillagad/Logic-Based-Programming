package Logic_Based_Programming;

import java.util.Scanner;

public class BinaryToDecimal {


 public  static void BinaryToDecimal(int n){

     String str=Integer.toString(n);
     System.out.println("Decimal :- "+Integer.parseInt(str,2));
 }

 public static void BinaryToDecimal1(int binary) {

     int n=0;
     int decimal=0;
     while (binary!=0){

         int temp=binary%10;
         decimal= (int) (decimal+(temp*Math.pow(2,n)));
           binary=binary/10;
           n++;

     }

     System.out.println("Decimal :- "+decimal);
 }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Binary Number");
        int n=sc.nextInt();
        BinaryToDecimal(n);
        BinaryToDecimal1(n);
    }
}
