package Logic_Based_Programming;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Eliminate_Odd_Numbers_within_Array {

    public static void remove(int[] arr){

        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0;i<arr.length;i=i+1){

            if(hashMap.get(arr[i])==null){
                hashMap.put(arr[i],1);
            }
            else{
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
        }

        Set<Map.Entry<Integer,Integer>> entries=hashMap.entrySet();

        String str="";
         for (Map.Entry<Integer,Integer> entry:entries){

             if(entry.getValue()%2==0){
                 str=str+entry.getKey()+" ";
             }
         }

        System.out.println(str);

    }

    public static void main(String[] args) {
        int[] arr={3, 3, 3, 2, 2, 4, 7, 7};
        remove(arr);

    }
}
