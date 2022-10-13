/*
An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Given an integer n, return the nth ugly number.

 

Example 1:

Input: n = 10
Output: 12
Explanation: [1, 2, 3, 4, 5, 6, 8, 9, 10, 12] is the sequence of the first 10 ugly numbers.
Example 2:

Input: n = 1
Output: 1
Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
*/


class NthUglyNumber {
    public int nthUglyNumber(int n) {
        if(n<=0){return 0;}
        ArrayList<Integer> result=new ArrayList<>();
        int two=0;
        int three=0;
        int five=0;
        result.add(1);
        while(result.size()<n){
            int m1=result.get(two)*2;
            int m2=result.get(three)*3;
            int m3=result.get(five)*5;
            
            int m=Math.min(m1,Math.min(m2,m3));
            result.add(m);
            if(m==m1){
                two++;
            }
            if(m==m2){
                three++;
            }
            if(m==m3){
                five++;
            }
        }
        return result.get(result.size()-1);
    }
}
