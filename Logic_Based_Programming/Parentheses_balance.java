package Logic_Based_Programming;

import java.util.ArrayDeque;
import java.util.Deque;

public class Parentheses_balance {

    public static void balanceBracket(String str){

        Deque<Character> stack=new ArrayDeque<>();

        for(int i=0;i<str.length();i=i+1){

            char x=str.charAt(i);
            if(x=='('||x=='{'||x=='['){

                stack.push(x);
            continue;
            }
            if(stack.isEmpty()){
                System.out.println("Stack is empty");
            }

            if(stack.peek()==')'){

            }


        }



    }


    public static void main(String[] args) {



    }
}
