package Logic_Based_Programming;

public class Inserting_element_position_array {

    public static  void InsertFirstPosition(int[] arr,int position,int x){

      int n=(arr.length);
      int[] arr1=new int[(n+1)];
      int index=0;

      for(int k=0;k<arr1.length;k=k+1){
          if(k==position) {
            arr1[k] = x;
            continue;
          }
          arr1[k]=arr[index];
          index=index+1;
      }

      String str="";
      for(int k=0;k<arr1.length;k=k+1){
          str=str+arr1[k]+" ";
      }
        System.out.println(str);
    }

    public static void main(String[] args) {

        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        InsertFirstPosition(arr,4,12);


    }
}
