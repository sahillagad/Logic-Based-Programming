package Logic_Based_Programming;

import java.util.SplittableRandom;

public class OneTimePassword {


    public static StringBuilder otpGenerated(int OTPLength){

      SplittableRandom splittableRandom=new SplittableRandom();

      StringBuilder sb=new StringBuilder();

     for(int i=0;i<OTPLength;i=i+1){
         int x=splittableRandom.nextInt(0,10);
         sb.append(x);
     }

        return sb;
    }


    public static void main(String[] args) {

       StringBuilder sb=otpGenerated(5);
        System.out.println("OTP : "+sb);

    }
}
