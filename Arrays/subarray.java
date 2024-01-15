
public class subarray {
    public static void printsub(int nos[]){
        for(int i=0;i<nos.length;i++){
            int start= i;
            for(int j=i; j<nos.length; j++){
                int end= j;
                for(int k= start; k<=end; k++){
                    System.out.print(nos[k]+" ");
                }
                 System.out.println();
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int nos[]={2,4,6,8,10};
        printsub(nos);
    }
}
