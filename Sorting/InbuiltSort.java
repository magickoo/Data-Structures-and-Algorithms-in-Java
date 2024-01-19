import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort {
    public static void printArr(Integer arr[]){
        for(int i=0;i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int arr[]= {5,4,1,2,3};
        Integer array[]={1,4,2,7,3};
        Arrays.sort(arr);
        Arrays.sort(array,Collections.reverseOrder());
        //printArr(arr);  // 1 2 3 4 5 
        printArr(array); // 7,4,3,2,1

    }
}
//Time Complexity: O(nlogn)
