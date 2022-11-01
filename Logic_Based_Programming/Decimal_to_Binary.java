package Logic_Based_Programming;

import java.util.Scanner;

public class Decimal_to_Binary {


    public static void  DecimalToBinary(int num){


        System.out.println("DecimalToBinary :-"+Integer.toBinaryString(num));
    }

    public  static void DecimalToBinary1(int num){

        int[] binaryNum=new int[1000];
        int i=0;

        while (num>0){

            binaryNum[i]=(num%2);
            num=num/2;
            i++;

        }

        String binary="";
        for(int k=i-1;k>=0;k=k-1){

            binary=binary+binaryNum[k];
        }


        System.out.println(binary);

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        DecimalToBinary1(num);
        DecimalToBinary(num);


    }
}
