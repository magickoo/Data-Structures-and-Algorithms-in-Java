import java.util.*;
public class Stringbuilder {
    public static void main(String[] args) {
        // empty string
        StringBuilder sb = new StringBuilder("");
        for(char ch='a' ; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
