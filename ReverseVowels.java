/*
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"
 

Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
*/

class ReverseVowels {
    public String reverseVowels(String s1) {
        char[] s=s1.toCharArray();
        Set<Character> vowels=new HashSet<>();
        vowels.add('a');
        vowels.add('A');
        vowels.add('e');
        vowels.add('E');
        vowels.add('i');
        vowels.add('I');
        vowels.add('o');
        vowels.add('O');
        vowels.add('u');
        vowels.add('U');

        int i=0;
        int j=s.length-1;

        while(i<j){
            if(!vowels.contains(s[i])){
                i++;
                continue;
            }
            if(!vowels.contains(s[j])){
                j--;
                continue;
            }

            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }

        return new String(s);


    }
}
