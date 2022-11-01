package Logic_Based_Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle_Name {


    public static  void ShufflingList(List<String> arr){

        Collections.shuffle(arr);

        System.out.println(arr);


    }

    public static void main(String[] args) {


        ArrayList<String> strings=new ArrayList<>();
        strings.add("ide");
        strings.add("quiz");
        strings.add("geeksforgeeks");
        strings.add("quiz");
        strings.add("practice");
        strings.add("qa");
        System.out.println(strings);
        ShufflingList(strings);
    }

}
