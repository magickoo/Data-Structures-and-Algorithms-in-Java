import java.util.*;
public class reversearray {
    public static void arrayrev(int arr[]){
       int start=0; 
       int end= arr.length -1;
       while(start<end){
        //swap
        int temp= arr[start];
        arr[start]= arr[end];
        arr[end]=temp;
        start++;
        end--;
        
       }
       System.out.println("Reversed Array:");
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
    }
    public static void main(String[] args){
        int arr[]={2,4,6,8,10};
        arrayrev(arr);

    }
}
