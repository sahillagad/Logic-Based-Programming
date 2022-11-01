package Logic_Based_Programming;

import java.util.Scanner;

public class Howmanyvowels {
    public static void countVowel(String str){

        Character[] chars={'a','e','i','o','u'};

        int count=0;
        for (int i=0;i<str.length();i=i+1){

            for (int j=0;j<chars.length;j=j+1) {

                 if(str.charAt(i)==chars[j]){

                     count=count+1;
                     break;
                 }

            }
        }

        System.out.println(count+" Vowel in the String "+str);


    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.nextLine();
        countVowel(str);


    }
}
