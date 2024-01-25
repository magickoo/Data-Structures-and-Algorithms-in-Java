public class dectoBin {

    public static void dectoBin(int dec){
        int bin=0;
        int pow=0;
        while(dec>0){
            bin= bin + ((dec % 2)*(int)Math.pow(10,pow));
            pow++;
            dec = dec/2;
        }
        System.out.println(bin);
    }
    public static void main(String[] args){
        dectoBin(8);

    }
}
