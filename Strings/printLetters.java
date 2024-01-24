import java.util.*;
public class printLetters {
    public static void printLet(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the str: ");
        String str= sc.nextLine();
        printLet(str);
    }
    
}
