public class substring {
    public static String Substring(String str,int si,int ei){
        int n=str.length();
        String substr = "";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        int si=1;
        int ei=3;
        String str= "happy";
        System.out.println(Substring(str,si,ei));
    }
}
