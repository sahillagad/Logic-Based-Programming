package Logic_Based_Programming;

import java.util.ArrayList;
import java.util.HashSet;

public class Shared_Digits {

    public static void Share(int[] arr1,int[] arr2){

        HashSet<Integer> set=new HashSet<>();

        for (int i=0;i<arr1.length;i=i+1){
            int num=arr1[i];

            for (int j=0;j<arr2.length;j=j+1) {

                if(num==arr2[j]){
                    if(set.contains(num)==false){
                        set.add(num);
                    }

                }
            }

        }

        String str="";
         for (int k:set){
             str=str+k+" ";
         }
        System.out.println(str);
    }

    public static void main(String[] args) {

int[] arr1={7,4,8,2,9,4};
int[] arr2={3,4,2,9,8,1,5,6};
Share(arr1,arr2);
    }
}

