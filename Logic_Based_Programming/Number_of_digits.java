package Logic_Based_Programming;


import java.util.Scanner;

public class Number_of_digits {

     public static  void numberOfDigit(int num){
         String n=Integer.toString(num);

         System.out.println("Number of digits in the entered integer are :: "+n.length());

     }



    public static void main(String[] args) {

        System.out.println("Enter a Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        numberOfDigit(n);



    }

}
