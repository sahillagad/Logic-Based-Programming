package Logic_Based_Programming;

public class Student_Rewarded {

    public static void Check(int[] arr){

         int count=0;
         int[] arr1=new int[arr.length];
        for(int i=0;i<arr.length;i=i+1){

         int num=(arr[i]+17);

         if(num>100){
             int c=num-100;
             num=100;
         }

         arr[i]=num;
         if(num>=50 && num<=100){
          count=count+1;

         }

        }

        System.out.println("Only "+count+" students will pass the exam.");

    }

    public static void main(String[] args) {


        int[] arr={0,21,83,45,64};
        Check(arr);


        int[] arr1={99, 50, 46, 47, 48, 49, 98};
        Check(arr1);
    }
}
