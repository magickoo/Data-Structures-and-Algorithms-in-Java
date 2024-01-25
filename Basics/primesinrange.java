import java.util.*;
public class primesinrange{

    public static boolean isprime(int n){

        boolean isPrime = true;
        for(int i=2;i<n;i++){

            if(n%i == 0){
                isPrime=false;
            }

        }
        return isPrime;

    }

    public static void primesrange(int n){
        for(int i=2;i<n;i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args){
        primesrange(15);

    }
}
