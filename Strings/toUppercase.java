//for a given string convert first letter of each word to Uppercase
import java.util.*;
public class toUppercase {
    public static String toCaps(String str){
        StringBuilder sb= new StringBuilder("");
        // first word
        sb.append(Character.toUpperCase(str.charAt(0)));
        // for next words
        for(int i=1; i<str.length() ; i++){
            //condition to check for a white space
            if(str.charAt(i)==' ' && i<str.length()){
                sb.append(str.charAt(i));
                i++;
                // Capitalize the first word and append it
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        String result = sb.toString();
        return result;

    }
    public static void main(String[] args) {
        String str= "hello my name is khushi agarwal.";
        System.out.println(toCaps(str));
        System.out.println(toCaps(str).length());
    }
}
// Time Complecity: O(n) where n is the length of the string
