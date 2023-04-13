/*
Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.

A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

For example, "ace" is a subsequence of "abcde".
A common subsequence of two strings is a subsequence that is common to both strings.

 

Example 1:

Input: text1 = "abcde", text2 = "ace" 
Output: 3  
Explanation: The longest common subsequence is "ace" and its length is 3.
Example 2:

Input: text1 = "abc", text2 = "abc"
Output: 3
Explanation: The longest common subsequence is "abc" and its length is 3.
Example 3:

Input: text1 = "abc", text2 = "def"
Output: 0
Explanation: There is no such common subsequence, so the result is 0.
 

Constraints:

1 <= text1.length, text2.length <= 1000
text1 and text2 consist of only lowercase English characters.

*/




class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        // return lcs(text1,text2,0,0);
        // return lcs2(text1,text2,text1.length()-1,text2.length()-1);
        int[][] dp=new int[text1.length()][text2.length()];
        for(int[]a:dp){
            Arrays.fill(a,-1);
        }
        return lcs3(text1,text2,0,0,dp);

    }
    // public int lcs(String s1,String s2,int i,int j){
    //     if(i==s1.length()||j==s2.length()){
    //         return 0;
    //     }
    //     int ans=0;
    //     if(s1.charAt(i)==s2.charAt(j)){
    //         ans=1+lcs(s1,s2,i+1,j+1);
    //     }
    //     else{
    //         int fs=lcs(s1,s2,i+1,j);
    //         int ss=lcs(s1,s2,i,j+1);
    //         ans=Math.max(fs,ss);
    //     }
    //     return ans;
    // }
    // public int lcs2(String s1,String s2,int i,int j){
    //     if(i<0||j<0){
    //         return 0;
    //     }
    //     int ans=0;
    //     if(s1.charAt(i)==s2.charAt(j)){
    //         ans=1+lcs2(s1,s2,i-1,j-1);
    //     }
    //     else{
    //         int fs=lcs2(s1,s2,i-1,j);
    //         int ss=lcs2(s1,s2,i,j-1);
    //         ans=Math.max(fs,ss);
    //     }
    //     return ans;
    // }
    public int lcs3(String s1,String s2,int i,int j,int[][] dp){
        if(i==s1.length()||j==s2.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans=1+lcs3(s1,s2,i+1,j+1,dp);
        }
        else{
            int fs=lcs3(s1,s2,i+1,j,dp);
            int ss=lcs3(s1,s2,i,j+1,dp);
            ans=Math.max(fs,ss);
        }
        return dp[i][j]=ans;
    }
}
