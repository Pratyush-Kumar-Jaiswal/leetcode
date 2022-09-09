/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
*/

class IsPalindrome {
    public boolean isPalindrome(String s) {
        String s1="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>=65&&c<=90){
                s1+=Character.toLowerCase(c);
            }
            else if((c>=97&&c<=122)||(c>=48&&c<=57)){
                s1+=c;
            }
        }
        String rs="";
        for(int i=s1.length()-1;i>=0;i--){
            rs+=s1.charAt(i);
        }
        if(rs.compareTo(s1)==0){return true;}
        else{return false;}
    }
}
