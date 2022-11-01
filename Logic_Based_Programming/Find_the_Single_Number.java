package Logic_Based_Programming;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Find_the_Single_Number {

    public static void Find(int[] arr){
        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for (int i=0;i<arr.length;i=i+1){

            if(hashMap.get(arr[i])==null){
                hashMap.put(arr[i],1);
            }
            else{
                hashMap.replace(arr[i],(hashMap.get(arr[i]))+1);
            }
        }

       Set<Map.Entry<Integer,Integer>> entries=hashMap.entrySet();

        for (Map.Entry<Integer,Integer> entry:entries){

             if(entry.getValue()==1) {
                 System.out.println(entry.getKey());
             }
             }
        System.out.println("-------------------------------------");
    }

    public static void main(String[] args) {

        int  arr[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3};
        Find(arr);

        int arr1[]={10, 20, 10, 30, 10, 30, 30};
        Find(arr1);

    }
}
