package Logic_Based_Programming;

public class Update_element_array {

    public static void DeleteElement(int[] arr,int position,int UpdateValue){
        int[] arr1=new int[(arr.length)];
        for (int i=0;i<arr1.length;i=i+1) {
           if(i==position){

               arr1[i]=UpdateValue;
               continue;
           }
           arr1[i]=arr[i];
        }

        String str="";
        for(int k=0;k<arr1.length;k=k+1){
            str=str+arr1[k]+" ";
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        int[] arr={2, 3, 4, 5, 6, 7, 8, 9, 10};
        DeleteElement(arr,0,12);
    }


}
