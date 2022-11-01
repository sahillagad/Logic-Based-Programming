package Logic_Based_Programming;

public class War_of_Numbers {
/*
Given an array A[], write a function that segregates even
and odd numbers.
The functions should put all even numbers first
and then odd numbers.
 */
    public static int[] warNum(int[] num){

       int[] arr=new  int[(num.length)];

       int index=0;
       for (int i=0;i<num.length;i=i+1){

           if((num[i]%2)==0){

               arr[index]=num[i];
               index=index+1;
           }
       }


        for (int i=0;i<num.length;i=i+1){

            if((num[i]%2)==1){

                arr[index]=num[i];
                index=index+1;
            }
        }

       return arr;


    }



    public static void main(String[] args) {

        int num[]= {12, 10, 9, 45, 2, 10, 10, 45};
        int result[]=warNum(num);


        StringBuilder sb=new StringBuilder();
        for (int i=0;i<result.length;i=i+1){

            sb.append(result[i]+" ");
        }

        System.out.println(sb);

    }
}
