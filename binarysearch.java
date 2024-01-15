public class binarysearch {
    public static int bs(int arr[],int key){
        int start=0 ; int end= arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;            
            }
            else if(arr[mid]<key){ //right
                start=mid+1;
            }
            else{ //left
                end= mid-1;
            }
        }
        return -1; // key not found
    }
    public static void main(String[] args){
        int arr[]={54,33,65,97};
        int key=65;
        int index= bs(arr,key);
        if(index==-1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key is found at index "+index);
        }
    }
}
