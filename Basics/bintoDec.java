import java.util.*;
class bintoDec{

    public static void bintoDec(int binNum){
        int pow=0;
        int decNum=0;
        while(binNum> 0){
        int ld=binNum % 10;
        decNum= decNum + (ld*(int)Math.pow(2,pow));
        pow++;
        binNum= binNum / 10;
        }
        System.out.println("The Decimal of binary is"+ decNum);

    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int binNum= sc.nextInt();
        bintoDec(binNum);

    }

}