package Logic_Based_Programming;

public class Sum_Of_All_Available_odd_index {
    public static void AllSum(int[] arr){

        int sum=0;
        for (int i=0;i<arr.length;i=i+1){
            if (i%2==1) {
                sum = sum + arr[i];
            }
        }
        System.out.println("Sum Of All Even Element : "+sum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        AllSum(arr);

    }
}

