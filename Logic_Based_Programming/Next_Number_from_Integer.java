package Logic_Based_Programming;


import java.util.Scanner;

public class Next_Number_from_Integer {

    public static int Next_Number(int n){

        n=n+1;


        return n;
    };


    public static void main(String[] args) {

        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int output=Next_Number(n);
        System.out.println("Next Number from Integer :- "+output);



    }
}
