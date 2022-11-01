package Logic_Based_Programming;

import java.util.Scanner;

public class Reverse_Integer {

    public static int reverseDigit(int n){

        String str=Integer.toString(n);
        String str1="";

        for (int i=str.length()-1;i>=0;i=i-1){


            str1=str1+str.charAt(i);
        }

        int num=Integer.parseInt(str1);

   return num;
    }

    public static void main(String[] args) {

        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int n=reverseDigit(s);

        System.out.println("Reverse Integer :- "+n);
    }
}
