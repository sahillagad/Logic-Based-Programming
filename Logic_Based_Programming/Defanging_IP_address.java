package Logic_Based_Programming;

import java.util.Scanner;

public class Defanging_IP_address {

    /*
     Given a valid (IPv4) Internet Protocol address S, the task is
     to find the defanged version of that IP address.
     Defanged Version of IP Address: is in which every period
     “.” is replaced by “[.]”.
     */


    public static  void IP_address(String str){

        String str2="";
        for (int i=0;i<str.length();i=i+1){

            if (str.charAt(i)=='.'){
                str2=str2+"[.]";
                continue;
            }
            str2=str2+str.charAt(i);
        }

        System.out.println("Input :- "+str);
        System.out.println("Output:- "+str2);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Internet Protocol address");
        String s=sc.next();
       IP_address(s);



    }
}
