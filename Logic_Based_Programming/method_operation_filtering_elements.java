package Logic_Based_Programming;

public class method_operation_filtering_elements {

    public static void filtering(int[] arr,int division){

        String str="";
        for (int i=0;i<arr.length;i=i+1){
            if(arr[i]%division==0){
                str=str+arr[i]+" ";
            }
        }

        System.out.println(str);

    }

    public static void main(String[] args) {

int[] arr={3, 4, 6, 12, 20};
filtering(arr,2);
filtering(arr,5);

    }
}
