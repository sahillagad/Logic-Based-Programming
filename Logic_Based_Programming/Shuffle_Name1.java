package Logic_Based_Programming;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Shuffle_Name1 {


    public static void CheckShuffle(List<String> list){

        SplittableRandom splittableRandom=new SplittableRandom();

        ArrayList<String> arrayList=new ArrayList<>();

      while (list.size()>=arrayList.size()){

          int x=splittableRandom.nextInt(0,list.size());
          boolean b=arrayList.contains(list.get(x));
          System.out.println(b);
          if(b==false){
              arrayList.add(list.get(x));
          }
      }

        System.out.println(arrayList);

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
        System.out.println(strings);
        CheckShuffle(strings);

    }
}
