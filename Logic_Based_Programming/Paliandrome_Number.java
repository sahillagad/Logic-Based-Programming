package Logic_Based_Programming;

import java.util.Scanner;

public class Paliandrome_Number {

 public static void paliandromeNumberCheck(int num){

     String str=Integer.toString(num);
     String str1="";
     for(int i=str.length()-1;i>=0;i=i-1){

         str1=str1+str.charAt(i);

     }


     boolean result=true;
     for(int j=0;j<str1.length();j=j+1){

         if(str.charAt(j)!=str1.charAt(j)){
             result=false;
             break;
         }

     }

     if(result==true){
         System.out.println("palindrome number ");
     }
     else if(result==false){
         System.out.println("not palindrome number ");
     }



 }




    public static void main(String[] args) {

        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        paliandromeNumberCheck(num);

    }
}
