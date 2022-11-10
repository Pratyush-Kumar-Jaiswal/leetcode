/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1
 

Constraints:

1 <= s.length <= 105
s consists of only lowercase English letters.
*/

class FirstUniqChar {
    public int firstUniqChar(String s) {
        int res=Integer.MAX_VALUE;

        int fo=-1;
        for(char c='a';c<='z';c++){
            fo=s.indexOf(c);

            if(fo!=-1 && fo==s.lastIndexOf(c)){
                res=Math.min(fo,res);
            }
        }
        if(res==Integer.MAX_VALUE){
            return -1;
        }
        return res;
    }
}
