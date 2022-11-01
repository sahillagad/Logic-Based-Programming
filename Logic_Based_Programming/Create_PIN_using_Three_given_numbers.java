package Logic_Based_Programming;

import java.util.Scanner;

public class Create_PIN_using_Three_given_numbers {


     public static String smallerValue(String str){
         String result="";

         int notepad=Integer.MAX_VALUE;


         for(int i=0;i<str.length();i=i+1){

             int n=Integer.parseInt(String.valueOf(str.charAt(i)));
             if(notepad>=n){

                 notepad=n;
             }

         }

         result=result+notepad;

         return result;
     }



     public static void generatePin(int num1,int num2,int num3){


         String str="";
         str=str+num1+num2+num3;


         String pin="";
         int notepad=0;
         for(int i=0;i<str.length();i=i+1){

             int n=Integer.parseInt(String.valueOf(str.charAt(i)));
             if(notepad<=n){

                 notepad=n;
             }
         }


         String s1=Integer.toString(num1);
         String s2=Integer.toString(num2);
         String s3=Integer.toString(num3);

        String p2=(String.valueOf(s1.charAt(0)))+(String.valueOf(s2.charAt(0)))+(String.valueOf(s3.charAt(0)));
        String p3=(String.valueOf(s1.charAt(1)))+(String.valueOf(s2.charAt(1)))+(String.valueOf(s3.charAt(1)));
        String p4=(String.valueOf(s1.charAt(2)))+(String.valueOf(s2.charAt(2)))+(String.valueOf(s3.charAt(2)));


        String position1=smallerValue(p2);
         String  position2=smallerValue(p3);
         String  position3=smallerValue(p4);

         System.out.println("Then Pin :- "+notepad+position1+position2+position3);

     }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1 ");
        int num1=sc.nextInt();

        System.out.println("Enter Number 2 ");
        int num2=sc.nextInt();

        System.out.println("Enter Number 3 ");
        int num3=sc.nextInt();


        generatePin(num1,num2,num3);

    }

}
