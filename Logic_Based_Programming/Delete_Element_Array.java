package Logic_Based_Programming;

public class Delete_Element_Array {

    public static void DeleteElement(int[] arr,int position){
            int[] arr1=new int[(arr.length-1)];
            int index=0;
            for (int i=0;i<arr1.length;i=i+1) {
             if(i==position){
                index=index+1;
             }

                arr1[i]=arr[index];
                 index=index+1;
            }

            String str="";
            for(int k=0;k<arr1.length;k=k+1){
                str=str+arr1[k]+" ";
            }
            System.out.println(str);
        }

        public static void main(String[] args) {

            int[] arr={2, 3, 4, 5, 6, 7, 8, 9, 10};
            DeleteElement(arr,0);
        }

    }


