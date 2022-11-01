package Logic_Based_Programming;

public class Reverse_only_First_half_elements {

    public static void ReverseOnlyFirstHalf(int[] arr) {

     int[] arr1=new int[(arr.length)];
     int n=0;
     if(arr.length%2==0){
         n=((arr.length)/2);
     }
     else if(arr.length%2==1){
         n=((arr.length+1)/2);
     }
      int index=0;
     for(int i=n-1;i>=0;i=i-1){
//         System.out.println(arr[i]);
         arr1[index]=arr[i];
         index=index+1;
     }



     for (int j=n;j<arr.length;j=j+1){
//         System.out.println(arr[j]);
         arr1[index]=arr[j];
         index=index+1;
     }

        String str2="";
        for (int k=0;k<arr1.length;k=k+1){
            str2=str2+arr1[k]+" ";
        }
        System.out.println(str2);
    }

    public static void main(String[] args) {
       int[] arr={1,2,3,4,5,6,7,9,10};
        ReverseOnlyFirstHalf(arr);
    }
}
