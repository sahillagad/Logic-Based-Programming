package Logic_Based_Programming;

public class Compare_Two_Arrays_Java {

    public  static boolean Compare(int[] arr1,int[] arr2){
 try {


     for (int i = 0; i < arr1.length; i = i + 1) {

         if (arr1[i] != arr2[i]) {

             return false;
         }

     }
     return true;
 }
 catch (Exception e){
     return false;
 }
    }

    public static void main(String[] args) {
        int[] a1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int[] a2 = new int[] {1, 2, 3, 4, 5, 6, 7};
      boolean b= Compare(a1,a2);
     if(b==true){
         System.out.println("Arrays are equal");
     }
     else{
         System.out.println("Arrays are not equal.");
     }
    }
}
