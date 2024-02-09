public class binarysearch {
    public static int bs(int arr[], int key,int s,int e){
        if(s >e){
            return -1;
        }
        int m = s+ (e-s)/2 ;

        if(arr[m] == key){
            return m;
        }
        if(key < arr[m]){
            return bs(arr,key,s,m-1);
        }

        return bs(arr,key,m+1,e);

    }
    public static void main(String[] args){
        int arr[] ={1,2,3,4,77,88};
        int target =4;
        int r = bs(arr,target,0,arr.length-1);
        System.out.println(r);

    }
}

