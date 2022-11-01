package Logic_Based_Programming;

public class Sum_palindrome_number_array {

    public static void PalindromeSum(int[] arr){

        int sum=0;
      for(int i=0;i<arr.length;i=i+1) {

          String str = Integer.toString(arr[i]);

          if (str.length() > 1) {
              String str1 = "";

              for (int j = (str.length() - 1); j >= 0; j = j - 1) {
                  str1 = str1 + str.charAt(j);
              }


              boolean b = false;
              for (int k = 0; k < str.length(); k = k + 1) {
                  if (str.charAt(k) != str1.charAt(k)) {
                      b = true;
                  }
              }
              if (b == false) {

                  sum = sum + arr[i];
              }

          }


      }
        System.out.println(sum);
    }

    public static void main(String[] args) {

       int  arr[]={12, 313, 11, 44, 9, 1};
        PalindromeSum(arr);

    }
}
