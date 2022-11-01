package Logic_Based_Programming;

public class Sum_Prime_Number_array {

    public static void SumAllPrime(int[] arr){

        int sum=0;
        for (int i=0;i<arr.length;i=i+1) {
          int count=0;
            for (int j=1;j<=arr[i];j=j+1) {

                if (arr[i] % j == 0) {
                    count=count+1;
                }
            }
            if(count==2){
                sum=sum+arr[i];
            }
        }


        System.out.println("Sum Of All Prime Number Element : "+sum);
    }

    public static void main(String[] args) {

        int[] ints={1,2,3,4,5};
        SumAllPrime(ints);


    }
}
