package Logic_Based_Programming;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Check_Birth_Day {

public static void checkTodayBirthdayOrNot(int day,String month){

    LocalDate date=LocalDate.now();
    System.out.println(date.getDayOfMonth()+" "+date.getMonth());
    if(date.getDayOfMonth()==day )
    if(month.equalsIgnoreCase(String.valueOf(date.getMonth()))){

        System.out.println("HAPPY BIRTHDAY TO YOU !!");
    }
    else{


        System.out.println("Today is not my birthday.");
    }


}


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter of Day Of Birth");
        int day=sc.nextInt();

        System.out.println("Enter Month of Birth in Word");
        String month=sc.next().toUpperCase();
        checkTodayBirthdayOrNot(day,month);





    }
}
