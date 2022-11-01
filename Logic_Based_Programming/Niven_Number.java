package Logic_Based_Programming;

public class Niven_Number {
    public static void checkNivenNumber(int n){

    String str=Integer.toString(n);
    int sum=0;

    for (int i=0;i<str.length();i=i+1){

        sum=sum+(Integer.parseInt(String.valueOf(str.charAt(i))));


    }

    if(n%sum==0){
        System.out.println("It Is Niven Number");
    }
    else{
        System.out.println("It is Not Niven Number");
    }
    }

    public static void main(String[] args) {


        int n=12;
        checkNivenNumber(n);



    }
}
