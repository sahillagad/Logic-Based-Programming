package Logic_Based_Programming;

import java.util.Scanner;

/*
A number is Oddish if the sum of all of its digits is odd,
 and a number is Evenish
if the sum of all of its digits is even.

We are required to write a function that determines
whether a number is Oddish or Evenish. We should return true of
Oddish values and false for evenish
 */
public class Oddish_Evenish {

    public static void CheckOddishEvenish(int num){

       String s=Integer.toString(num);


       int sum=0;
       for (int i=0;i<s.length();i=i+1){

           sum=sum+(Integer.parseInt(String.valueOf(s.charAt(i))));


       }

       if(sum%2==0){
           System.out.println(num+" number is  Evenish ");
       }
       else{
           System.out.println(num +" number is  Oddish ");
       }


    }

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        CheckOddishEvenish(num);


    }
}
