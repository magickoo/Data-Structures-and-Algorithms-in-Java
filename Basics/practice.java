import java.util.*;
class practice{
    public static void main(String[] args){
        System.out.print("hello");
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        do{
            int n=sc.nextInt();
            if(n%10 == 0){
                continue;
            }
            System.out.println(n);
        }
        while(true);
    }
}