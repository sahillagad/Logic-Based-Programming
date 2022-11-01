package Logic_Based_Programming;

import java.util.Scanner;

public class ReverseorderofaString {

public  static  void reverseString(String s){


    String str="";
    for (int i=(s.length()-1);i>=0;i=i-1){

        str=str+s.charAt(i);
    }

    System.out.println(str);
}

    public static void main(String[] args) {

        System.out.println("Enter String");
        Scanner sc=new Scanner(System.in);

        String s=sc.next();
        reverseString(s);




    }

}
