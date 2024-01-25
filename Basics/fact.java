import java.util.*;
public class fact {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f= f*i;
        }

        return f;

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ans=fact(n);
        System.out.println("The factorial of number "+ n+ " is "+ ans);

    }
}
