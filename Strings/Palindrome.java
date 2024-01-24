import java.util.*;
public class Palindrome {
    public static boolean palindrome(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i) !=str.charAt(n-1-i)){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        String str= "racecar";
        if(palindrome(str)){
            System.out.println("The string is a palindrome");
        }
        else{
            System.out.println("The string is not a plaindrome");
        }
    }   
}
// Time Complexity: O(n)