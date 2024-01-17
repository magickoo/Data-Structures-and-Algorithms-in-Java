public class optimizedBubbleSort {
    public static void bubbleSort(int arr[]){
        int n=arr.length;
        boolean swap= false;
        for(int turn=0; turn<n-1; turn++){
            for(int j=0; j<n-1-turn ; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    swap= true;
                }
            }
            if (!swap){
                break;
                
            }
        
        }

    }
    public static void printarr(int arr[]){
        for(int i=0 ;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        bubbleSort(arr);
        System.out.println("Sorted array is: ");
        printarr(arr);
    }
    
}
