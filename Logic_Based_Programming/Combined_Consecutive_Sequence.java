package Logic_Based_Programming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Combined_Consecutive_Sequence {

    public  static void Check(int[] arr){

        for(int i=0;i<arr.length;i=i+1){
            for(int j=i+1;j<arr.length;j=j+1) {
                if (arr[i] > arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        List<Integer> list=new ArrayList<>();
        int count=1;
        for (int k=1;k<arr.length;k=k+1){

            if(arr[k]==arr[k-1]+1){

                count=count+1;
            }
            else{
                list.add(count);
                count=1;
            }
        }

        List<Integer> list1= list.stream().sorted().collect(Collectors.toList());
           int notepad=Integer.MIN_VALUE;
            for (Integer n:list1){
//                System.out.println(n);
                if(n>notepad){
                    notepad=n;
                }
            }

        System.out.println("Length of the Longest contiguous subsequence is "+notepad);

    }

    public static void main(String[] args) {

        int arr[] = {1, 9, 3, 10, 4, 20, 2};
        Check(arr);

        int arr1[]={36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};
        Check(arr1);
    }
}
