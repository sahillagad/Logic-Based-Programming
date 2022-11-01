package Logic_Based_Programming;

import java.util.Scanner;

public class Extract_Digits_from_the_number {

    public static void ExtractDigits(int n){

        String str=Integer.toString(n);

        for(int i=0;i<str.length();i=i+1) {
            System.out.println(Integer.parseInt(String.valueOf(str.charAt(i))));
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ExtractDigits(n);




    }
}
