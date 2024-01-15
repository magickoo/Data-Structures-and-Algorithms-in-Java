public class maxsubsum {
    public static void maxsum(int nos[]){
        int cursum=0;
        int maxsum= Integer.MIN_VALUE;
        for(int i=0;i<nos.length;i++){
            int start= i;
            for(int j=i;j<nos.length;j++){
                int end=j;
                cursum=0;

                for(int k=start; k<=end ;k++){
                    cursum =cursum + nos[k];

                }
                System.out.println(cursum);
                if(maxsum<cursum){
                    maxsum= cursum;
                }

            }

        }
        System.out.println("The max sum is"+ maxsum);


    }
    public static void main(String[] args) {
        int nos[]={1,-2,6,-1,3};
        maxsum(nos);

    }
}
