package Logic_Based_Programming;

import java.util.Scanner;

public class Video_Length {
    //Obtaining the Length of a String

    public static void LengthString(String s){

        System.out.println("String        :- "+s);
        System.out.println("String Length :- "+s.length());

    }

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        LengthString(s);


    }
}
