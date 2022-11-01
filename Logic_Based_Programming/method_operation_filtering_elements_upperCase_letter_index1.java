package Logic_Based_Programming;

public class method_operation_filtering_elements_upperCase_letter_index1 {

    public static void Filter(String[] arr){

        char[] chars={ 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

        String str="";
        for (int i=0;i<arr.length;i=i+1){

            for (int j=0;j<chars.length;j=j+1) {
                if (arr[i].charAt(1)==chars[j]){

                    str=str+arr[i]+" ";
                }

            }
        }

        System.out.println(str);


    }

    public static void main(String[] args) {

       String[] strings={ "Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks"};
       Filter(strings);

    }
}
