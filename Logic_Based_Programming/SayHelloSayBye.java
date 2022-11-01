package Logic_Based_Programming;

import java.util.Scanner;

public class SayHelloSayBye {

    public static void Sye(int i){

        if(i==0){
            System.out.println("Hello");
        }
        else if(i==1){
            System.out.println("Bye");
        }

    }

    public static void main(String[] args) {

        System.out.println("Enter 1 for Hello and Enter 2 for Bye");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        Sye(i);

    }
}
