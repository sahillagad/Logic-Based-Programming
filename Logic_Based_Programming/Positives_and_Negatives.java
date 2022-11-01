package Logic_Based_Programming;

public class Positives_and_Negatives {

    public static void Positives_Negatives(int num){

        if(num>0){
            System.out.println(num+" is Positive");
        }
        else if(num<0){
            System.out.println(num+" is Negative");
        }
        else if(num==0){
            System.out.println(num+" is Zero ");
        }
    }

    public static void main(String[] args) {

        Positives_Negatives(915);
        Positives_Negatives(-78);
        Positives_Negatives(0);
    }
}
