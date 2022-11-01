package Logic_Based_Programming;

import java.util.Scanner;

public class FreeCoffeeCups {


    public static int totalCup(int n){

        n=(Math.round(n/6)+n);

        return n;
    }

    public static void main(String[] args) {

        System.out.println("---Welcome To Our Coffee Shop\n");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number OF Cups");
        int n=sc.nextInt();

        int x=totalCup(n);
        System.out.println("For "+n+" cups the total number of cups i would get "+x);




    }
}
