package Logic_Based_Programming;

public class Inserting_element_last_position_array {

    public static void InsertLastPosition(int[] arr,int x){

        int n=(arr.length);
        int[] arr1=new int[(n+1)];
        int index=0;

        for(int k=0;k<arr1.length;k=k+1){
            if(k==(arr1.length-1)) {
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
        InsertLastPosition(arr,77);


    }
}
