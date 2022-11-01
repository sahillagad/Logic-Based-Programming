package Logic_Based_Programming;


import java.util.HashMap;
import java.util.Map;

public class Number_of_Occurrences {


    public static void numberOccurrences(int[] arr){

        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0;i<arr.length;i=i+1){

           if(hashMap.get(arr[i])==null){

               hashMap.put(arr[i],1);
           }

           else{

              Integer inte=((hashMap.get(arr[i]))+1);
              hashMap.replace(arr[i],inte);
            }


        }


        hashMap.forEach((integer, integer2) -> {

            System.out.println(integer+" "+integer2);
        });
    }


    public static void main(String[] args) {

       int arr[] = {1, 1, 2, 2, 2, 2, 3,};
       numberOccurrences(arr);

    }
}
