/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//reverse Stack
import java.util.*;
public class Main
{
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int k=s.pop();
        pushAtBottom(s,data);
        s.push(k);
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int k=s.pop();
        reverseStack(s);
        pushAtBottom(s,k);
    }
	public static void main(String[] args) {
		Stack<Integer> st= new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println(st);
		reverseStack(st);
		System.out.println(st);
	}
}
