/*
Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 

Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
*/



class AddBinary {
    public String addBinary(String a, String b) {
        if(a==""){return b;}
        if(b==""){return a;}
        int alen=a.length()-1;
        int blen=b.length()-1;
        int carry=0;
        StringBuilder res=new StringBuilder();
        while(alen>=0 || blen>=0){
            int sum=carry;
            if(alen>=0){
                sum+=(a.charAt(alen--)-'0');
            }
            if(blen>=0){
                sum+=(b.charAt(blen--)-'0');
            }
            res.insert(0,(sum%2));
            carry=sum/2;
        }
        if(carry==1){
            res.insert(0,1);
        }
        return res.toString();
    }
}
