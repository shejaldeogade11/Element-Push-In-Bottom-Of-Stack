///QUESTION 1 push data at bottom

import java.util.*;
public class StackPushBottom{
    public static void pushAtBottom(Stack<Integer> s, int data){

          if(s.isEmpty()){
            s.push(data);
            return;
          }

        int top = s.pop();  //remove all element and store
        pushAtBottom(s,data);
        s.push(top);    //that data add in pop time remove from top 
    }

    public static void main(String args[]){
        Stack <Integer> s = new Stack<> ();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s,4);
           
        while(!s.isEmpty()){
            System.out.println(s.pop());

        }
    }
}