/*
推算出来其实就是斐波那契，但是用递归做超时了..
*/
class Solution {
    public int climbStairs(int n) {
        if(n <= 2)  return n;
        int a = 1;
        int b = 2;
        for(int i = 3; i <= n; i++){
            int temp = a;
            a = b;
            b = temp + a;
        }
        return b;
    }
}