import java.util.*;
public class swap{

    public static void swap(int a , int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping:");
        System.out.println("a: "+ a);
        System.out.println("b: "+ b );


    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before Swapping");
        
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        swap(a,b);
            
    }
}
