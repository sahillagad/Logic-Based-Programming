package Logic_Based_Programming;

import java.util.Scanner;

public class FahrenheitCelsius {


    public static void FahrenheitCelsius(Double F){

        Double C=(((F-32)*5)/9);

        System.out.println("Temperature in Celsius :) "+C);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  temperature in Fahrenheit ");
        Double F=sc.nextDouble();
        FahrenheitCelsius(F);
    }
}
