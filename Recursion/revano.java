public class revano {
    static int sum = 0;
    public static void reverse(int no){
        if(no==0){
            return ;
        }
        int rem = no % 10;
        sum= sum*10 + rem;
        reverse(no/10);
    }
    public static void main(String[] args) {
        reverse(1234);
        System.out.println(sum);
    }
}
