/*
Given a string s, reverse the string according to the following rules:

All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.

 

Example 1:

Input: s = "ab-cd"
Output: "dc-ba"
Example 2:

Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
 

Constraints:

1 <= s.length <= 100
s consists of characters with ASCII values in the range [33, 122].
s does not contain '\"' or '\\'.
*/

class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            char c1=arr[i];
            char c2=arr[j];
            if(!(Character.isLetter(c1))){
                i++;
                continue;
            }
            if(!(Character.isLetter(c2))){
                j--;
                continue;
            }
            arr[i]=c2;
            arr[j]=c1;
            i++;j--;
        }
        return new String(arr);
    }
}
