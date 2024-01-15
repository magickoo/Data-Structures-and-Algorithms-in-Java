
import java.util.*;
public class largestno {
    public static int larg(int num[]){
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                 largest=num[i];
            }
        }
        return largest;

    }
    public static void main(String[] args){
        int num[]= {5,98,42,54};
        int l= larg(num);
        System.out.println(l);
    }
    
}
