public class Solution {
//Given a positive integer n, break it into the sum of at least two positive integers and maximize the product of those integers. Return the maximum product you can get.

For example, given n = 2, return 1 (2 = 1 + 1); given n = 10, return 36 (10 = 3 + 3 + 4).
    public int integerBreak(int n) {
        if(n==2||n==3) return n-1;
        if(n==4)return 4;
        int product= 1;
        while (n>4){
            n-=3;
            product*=3;
            
        }
        return product*n;
    }
    
    // we need to divide n to threes as many as possible , but if the last left value is 4, we divide it in to 2 twos.
}
