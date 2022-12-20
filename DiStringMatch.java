/*
A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

s[i] == 'I' if perm[i] < perm[i + 1], and
s[i] == 'D' if perm[i] > perm[i + 1].
Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.

 

Example 1:

Input: s = "IDID"
Output: [0,4,1,3,2]
Example 2:

Input: s = "III"
Output: [0,1,2,3]
Example 3:

Input: s = "DDI"
Output: [3,2,0,1]
 

Constraints:

1 <= s.length <= 105
s[i] is either 'I' or 'D'.
*/

class DiStringMatch {
    public int[] diStringMatch(String s) {
        int[] res=new int[s.length()+1];
        int lp=0;
        int rp=s.length();
        int index=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='I'){
                res[index]=lp;
                index++;
                lp++;
            }
            else if(c=='D'){
                res[index]=rp;
                index++;
                rp--;
            }
        }
        if(s.charAt(s.length()-1)=='I'){res[index]=lp;}
        else if(s.charAt(s.length()-1)=='D'){res[index]=rp;}
        return res;
    }
}
