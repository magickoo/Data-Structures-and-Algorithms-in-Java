import java.util.*;
public class ShortestPath {
    public static int sp(String str){
        int n=str.length();
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            
            if(str.charAt(i)=='N'){
                y++;
            }
            if(str.charAt(i)=='S'){
                y--;
            }
            if(str.charAt(i)=='E'){
                x++;
            }
            if(str.charAt(i)=='W'){
                x--;
            }
        }

        int shortest_path = (int)Math.sqrt((x*x)+ (y*y));
        return shortest_path;
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        System.out.println("The shortest path is "+ sp(str));
        
    }
}
// Time Complexity: O(n)