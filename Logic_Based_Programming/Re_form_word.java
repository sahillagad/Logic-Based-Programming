package Logic_Based_Programming;

import java.util.Scanner;

public class Re_form_word {

    public static void ReFormWord(String str){

       String s=str.trim();
        int start=0;
        String str1="";
        for (int i=0;i<str.length();i=i+1) {

           if(str.charAt(i)==' '||(str.length()-1)==i){

                str1 =str1+str.substring(start,start+1).toUpperCase() + str.substring(start+1,i+1);
                start=i+1;


           }



       }
        System.out.println(str1);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String");
        String str=sc.nextLine();
        ReFormWord(str);


    }
}
