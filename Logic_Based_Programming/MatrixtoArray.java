package Logic_Based_Programming;

public class MatrixtoArray {

    public static void Check(int[][] arr){
        int index=1;
        for (int i=0;i<arr.length;i=i+1){
            for (int j=0;j<arr.length;j=j+1){
                arr[i][j]=index;
                index=index+1;
            }
        }

        for (int p=0;p<arr.length;p=p+1){
            String s="";
            for (int q=0;q<arr.length;q=q+1) {

                s=s+arr[p][q]+" ";

            }
            System.out.println(s);
        }


    }

    public static void main(String[] args) {

        int[][] arr=new int[10][10];
        Check(arr);

    }
}
