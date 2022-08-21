/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1
*/


class Reverse {
    public int reverse(int x) {
        long rn=0;int sign=0;
        if(x<0){
            sign=1;
            x=-x;
        }
        while(x!=0){
            int d=x%10;
            rn=rn*10+d;
            x/=10;
        }
        if(sign==1){
            rn=-rn;
        }
        if(rn<Integer.MIN_VALUE || rn>Integer.MAX_VALUE){
            return 0;
        }
        return (int)rn;
    }
}
