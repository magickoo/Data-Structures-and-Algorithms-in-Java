//Recursive

import java.util.*;
class Main{
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int k = s.pop();
        pushAtBottom(s,data);
        s.push(k);
        
    }
    //public static void 
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
        pushAtBottom(s,20);
        System.out.println(s);
        
        
    }
}
