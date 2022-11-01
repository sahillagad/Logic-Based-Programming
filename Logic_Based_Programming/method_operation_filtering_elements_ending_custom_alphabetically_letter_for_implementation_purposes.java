package Logic_Based_Programming;

public class method_operation_filtering_elements_ending_custom_alphabetically_letter_for_implementation_purposes {

    public static void filter(String[] arr){

        String str="";
        for (int i=0;i<arr.length;i=i+1){

            if(String.valueOf(arr[i].charAt((arr[i].length()-1))).equalsIgnoreCase("s")){
                str=str+arr[i]+" ";
            }
        }
        System.out.println(str);

    }
    public static void main(String[] args) {

        String[] strings={"Geeks", "foR", "GeEksQuiz", "GeeksforGeeks"};
        filter(strings);


    }
}

