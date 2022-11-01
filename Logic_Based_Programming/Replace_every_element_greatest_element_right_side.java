package Logic_Based_Programming;

public class Replace_every_element_greatest_element_right_side {


  public static void ReplaceEvery(int[] arr){

      int[] array=new int[arr.length];
      int index=0;
      for (int i=0;i<array.length;i=i+1){
          boolean b=false;
          for (int j=i+1;j<arr.length;j=j+1) {
              if(arr[i]<arr[j]){
                  array[index]=arr[j];
               index=index+1;
               b=true;
               break;
              }
          }
          if(b==false){
              array[index]=-1;
              index=index+1;
          }
      }

      String str="";

      for (int k=0;k<array.length;k=k+1){

          str=str+array[k]+" ";

      }
      System.out.println(str);
  }

    public static void main(String[] args) {


      int[] arr={16, 17, 4, 3, 5, 2};
      ReplaceEvery(arr);
    }
}
