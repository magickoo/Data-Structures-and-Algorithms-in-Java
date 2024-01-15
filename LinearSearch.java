import java.util.*;
public class LinearSearch {
    public static int ls(int nums[],int key){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                return i;
            }
            
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<n ;i++){
            nums[i]=sc.nextInt();
        }
        int key=20;
        int index= ls(nums,key);
        if(index==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at "+ index+ " index");
        }

    }

}
