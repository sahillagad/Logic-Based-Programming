package Logic_Based_Programming;

import java.util.*;

public class Number_duplicate_elements_array {

    public static void Duplicate(int[] arr){


        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0;i<arr.length;i=i+1) {

            if (hashMap.get(arr[i])==null){
                hashMap.put(arr[i],1);

            }
            else {
                hashMap.replace(arr[i],hashMap.get(arr[i])+1);
            }

        }

        Set<Map.Entry<Integer,Integer>> entries=hashMap.entrySet();
          String s="";
          for (Map.Entry<Integer,Integer> entry:entries){
            if(entry.getValue()>=2){

                s=s+entry.getKey()+" ";
            }

          }
        System.out.println(s);

     }

    public static void main(String[] args) {
       int[] arr={1, 2, 3, 6, 3, 6, 1};
       Duplicate(arr);
    }

}
