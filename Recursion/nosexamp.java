public class nosexamp{
    static void printno(int no){
        if(no==5){
            return;
        }
        System.out.println(no);
        //tail recursion
        printno(no+1);
    }

    public static void main(String[] args){
        printno(1);

    }
}
