//this code is printing the nth term of the fibonacci series
public class fibonacci {
    public static void main(String args[]){
        System.out.println(fibo(3));

    }
    public static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
