import java.util.*;
public class create {
    public static boolean check(int arr[][], int key){
        for(int i=0;i<arr.length; i++){
            for(int j =0 ; j<arr.length ; j++){
                if(key==arr[i][j]){
                    System.out.println("The key is found at ("+ i+ ","+ j + ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void printArr(int arr[][]){
        for(int i=0 ; i<arr.length ;i++){
            for(int j=0; j<arr.length ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int n=3;
        for(int i=0;i<n;i++){
            for(int j=0 ;j<n ; j++){
               arr[i][j] = sc.nextInt();
            }
        }
        printArr(arr);
        System.out.println(check(arr,5));
    }
}
