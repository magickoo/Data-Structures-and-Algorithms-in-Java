//euclideans algorithm for finding greatest common divisor
public class Solution {
    public static int calcGCD(int num1, int num2){
        // Write your code here.
        while(num2!=0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}

//Time Complexity: O(logn)
