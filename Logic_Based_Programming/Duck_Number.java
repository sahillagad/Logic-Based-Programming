package Logic_Based_Programming;

import java.util.Scanner;

public class Duck_Number {


    public static void DuckNumberCheck(String n){

        if(n.charAt(0)!='0'){
            System.out.println(n + " is a Duck number");
        }
        else{
            System.out.println(n + " is not a Duck number");
        }
    }


    public static void main(String[] args) {

        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        DuckNumberCheck(str);

    }
}
