import java.util.*;
public class kadane {
    public static void maxsubsum(int nos[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<nos.length;i++){
            cs= cs+nos[i];
            if(cs<0 ){
                cs=0;
            }
            ms= Math.max(cs,ms);
        }
        System.out.println("The maximum subarray sum is "+ ms);

    }
    public static void main(String[] args){
        int nos[]={-2,-3,4,-1,-2,1,5,-3};
        maxsubsum(nos);  // output: 7

    }
}
