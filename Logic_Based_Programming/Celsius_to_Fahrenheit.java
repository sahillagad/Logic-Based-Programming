package Logic_Based_Programming;

import java.util.Scanner;

public class Celsius_to_Fahrenheit {

public static void CelsiusFahrenheit(Double C){

  Double F=(((C*9)/5)+32);

    System.out.println("Temperature in Fahrenheit :) "+F);
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  temperature in Celsius");
         Double C=sc.nextDouble();
        CelsiusFahrenheit(C);
    }
}
