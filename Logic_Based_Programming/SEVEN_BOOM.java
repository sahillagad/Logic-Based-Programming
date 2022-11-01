package Logic_Based_Programming;

public class SEVEN_BOOM {

    public static boolean Boom(int[] arr){


        for (int i=0;i<arr.length;i=i+1){

            if(arr[i]==7){
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr={8, 6, 33, 100};
       boolean b= Boom(arr);
       if (b==true){
           System.out.println("Boom!");
       }
       else{
           System.out.println("There is no. 7 in the array.");
       }



    }
}
