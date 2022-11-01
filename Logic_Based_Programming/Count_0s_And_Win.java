package Logic_Based_Programming;

public class Count_0s_And_Win {

    public static void Count(long num){


        long factorial=1;
        for (long i=1;i<=num;i=i+1){

            factorial=factorial*i;
        }

//        System.out.println(factorial);

        String str=String.valueOf(factorial);
        int count=0;
        for (int k=0;k<str.length();k=k+1){
            if (str.charAt(k)=='0'){
                count=count+1;
            }
        }

        System.out.println("Count of trailing 0s in "+num+" is "+factorial);

    }

    public static void main(String[] args) {

        Count(5);
        Count(20);
    }
}
