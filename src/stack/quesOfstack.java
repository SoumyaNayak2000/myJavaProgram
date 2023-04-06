package stack;

import java.util.Scanner;
import java.util.Stack;

public class quesOfstack {
    public static boolean isBalanced(String expr){
        Stack<Character> stack=new Stack<>();
        //  }}
        for(int i=0;i<expr.length();i++){
            char bracket=expr.charAt(i);  //  }  ]  )

            if(bracket == '(' || bracket== '{' || bracket == '['){
                stack.push(bracket);
                continue;
            }

            if(stack.isEmpty()){
                return false;
            }

            char poppedElement=stack.pop(); //'{'

            if(bracket=='}' && poppedElement!='{') {
                return false;
            }
            else if(bracket==']' &&poppedElement!='[') {
                return false;
            }
            else if( bracket==')' && poppedElement!='(') {
                return false;
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String expression=sc.next(); //"[()]{}{[()()]()}" //[()]{}{}{{[()()]()
        System.out.println(isBalanced(expression)); // true - balanced
        // false - not balanced
    }
}
/*
Given an expression string exp, write a program to examine whether the pairs and the orders
 of “{“, “}”, “(“, “)”, “[“, “]” are correct in the given expression.
             [ ( ) ] { } { [ ( )  (   )   ]   (   )   }
             0 1 2 3 4 5 6 7 8 9 10   11  12  13  14  15
*/
