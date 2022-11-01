package Logic_Based_Programming;

import java.util.Scanner;

public class Valid_Palindrome {

    public static void PalindromeCheck(String str){


        String str1="";
        for (int i=str.length()-1;i>=0;i=i-1){
              str1=str1+str.charAt(i);
        }

        boolean b=true;
        for (int j=0;j<str1.length();j=j+1){
            if(str1.charAt(j)!=str.charAt(j)){
                b=false;
                break;
            }
        }

        if(b==true) {
            System.out.println("it is Palindrome");
        }
        else{
            System.out.println("it not a Palindrome");
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str= sc.next();
        PalindromeCheck(str);


    }

}
