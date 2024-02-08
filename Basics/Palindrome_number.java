class Solution {
    public boolean isPalindrome(int x) {
        if(x< 0){
            return false;
        }
        int y=x;
        int rev=0;
        //find reverse of number and check if it equals to the original no
        while(y !=0){
            int digit= y %10;
            rev = rev*10 + digit ;
            y = y/10;
        }
        return rev==x;
    }
}
