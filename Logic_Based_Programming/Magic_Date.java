package Logic_Based_Programming;

import java.util.Scanner;

public class Magic_Date {

    public static void CheckMagicDate(int day,int month,int year){

        int pro=(day*month);
        if(pro==year){
            System.out.println("This date is magic! ");
        }
        else{
            System.out.println("This date is not magic..");
        }

    }

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The value of Day :" );
        int day=sc.nextInt();

        System.out.println("Enter The Value of Month : ");
        int month=sc.nextInt();

        System.out.println("Enter The Value of Two Digit Year (if Year 1960 than  only Write 60)");
        int year=sc.nextInt();

        CheckMagicDate(day,month,year);

    }


}
