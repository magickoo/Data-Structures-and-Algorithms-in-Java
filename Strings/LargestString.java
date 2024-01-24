import java.util.*;
class LargestString{
    public static void main(String[] args){
        String fruits[] ={"apple", "mango","lichi"};
        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++){
            if(largest.compareToIgnoreCase(fruits[i])<0){

                largest= fruits[i];
            }
        }
        System.out.println(largest);
    }
}
// Time Complexity: O(x*N) where x is the number of characters in a string