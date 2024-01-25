import java.util.*;
public class binomial {

    public static int fact(int n){
            int f=1;
            for(int i=1;i<=n;i++){
                f= f*i;
            }
    
            return f;
    
        }


    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int n_fact= fact(n);
        int r_fact= fact(r);
        int d = fact(n-r);
        int ans= n_fact/(r_fact* d);
        System.out.println(ans);
        
    }
}
