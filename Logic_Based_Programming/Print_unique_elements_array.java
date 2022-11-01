package Logic_Based_Programming;

import java.util.HashMap;
import java.util.HashSet;

public class Print_unique_elements_array {

public static void Unique(int[] arr){

    HashSet<Integer> set=new HashSet<>();
    for (int i=0;i<arr.length;i=i+1){

        if (set.contains(arr[i])==false){
            set.add(arr[i]);
        }
    }

    String s="";
    for (Integer num:set){

         s=s+num+" ";
    }

    System.out.println(s);
}

    public static void main(String[] args) {
        int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
          Unique(arr);
     }
}
