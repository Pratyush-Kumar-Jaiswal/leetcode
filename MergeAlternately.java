/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

 

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d
 

Constraints:

1 <= word1.length, word2.length <= 100
word1 and word2 consist of lowercase English letters.
*/





class MergeAlternately {
    public String mergeAlternately(String w1, String w2) {
        if(w1.length()==0||w2.length()==0){return "";}
        if(w1.length()==0){return w2;}
        if(w2.length()==0){return w1;}
        int i=0;
        int j=0;
        String rs="";
        while(i<w1.length()&&j<w2.length()){
            rs+=w1.charAt(i);
            rs+=w2.charAt(j);
            i++;
            j++;
        }
        if(i==w1.length()&&j==w2.length()){return rs;}
        else{
            if(i!=w1.length()){
                rs+=w1.substring(i,w1.length());
            }
            else if(j!=w2.length()){
                rs+=w2.substring(j,w2.length());
            }
            return rs;
        }
    }
}
