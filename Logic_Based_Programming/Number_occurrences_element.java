package Logic_Based_Programming;

import java.util.HashMap;
import java.util.HashSet;

public class Number_occurrences_element {

    public static void CheckOccurrence(int[] arr){

        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for (int i=0;i<arr.length;i=i+1){

            if(hashMap.get(arr[i])==null){

                hashMap.put(arr[i],1);
            }
            else{
                hashMap.replace(arr[i],hashMap.get(arr[i])+1);
            }

        }

        hashMap.forEach((integer, integer2) -> {
            System.out.println(integer+" "+integer2);
        });


    }



    public static void main(String[] args) {

        int[] arr={1,2,3,3,5,3,1};
        CheckOccurrence(arr);

    }
}
