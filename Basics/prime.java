import java.util.*;
class java{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime = true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        if(isPrime == true){
            System.out.println("Its is a prime no");
        }
        else{
            System.out.println("It is not a prime no");
        }
        
}
}
