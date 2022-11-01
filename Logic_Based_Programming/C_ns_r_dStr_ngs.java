package Logic_Based_Programming;

public class C_ns_r_dStr_ngs {

    public static void print(String str,String str1){

        int index=0;
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<str.length();i=i+1){

           if(str.charAt(i)=='*'){

               sb.append(str1.charAt(index));
               index=index+1;
           continue;
           }
           else{
               sb.append(str.charAt(i));
           }



        }

        System.out.println("Input : "+str);
        System.out.println("Output : "+sb);
        System.out.println("---------------------");

    }

    public static void main(String[] args) {


        print("Wh*r* d*d my v*w*ls g*?","eeioeo");
        print("abcd","");
        print("*PP*RC*S*","UEAE");


    }


}
