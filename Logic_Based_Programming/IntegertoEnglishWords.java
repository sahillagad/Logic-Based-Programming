package Logic_Based_Programming;

import java.util.HashMap;

public class IntegertoEnglishWords {

public static  void Check(String str){

    HashMap<Integer,String> hashMap=new HashMap<>();
    hashMap.put(0,"zero");
    hashMap.put(1,"one");
    hashMap.put(2,"two");
    hashMap.put(3,"three");
    hashMap.put(4,"four");
    hashMap.put(5,"five");
    hashMap.put(6,"six");
    hashMap.put(7,"seven");
    hashMap.put(8,"eigth");
    hashMap.put(9,"nine");

    StringBuilder sb=new StringBuilder();
    for (int i=0;i<str.length();i=i+1){

        Integer x=Integer.parseInt(String.valueOf(str.charAt(i)));
        if(hashMap.containsKey(x)==true){

            sb.append(hashMap.get(x)+" ");

        }
    }


    System.out.println(sb);
}

    public static void main(String[] args) {

    Check("987540");


    }

}
