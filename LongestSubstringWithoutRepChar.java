/*
Given a string s, find the length of the longest substring without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
*/











class LongestSubstringWithoutRepChar {
    public int lengthOfLongestSubstring(String s) {
        if(s==null)
            return 0;
	boolean[] flag = new boolean[256];
 
	int result = 0;
	int start = 0;
	char[] arr = s.toCharArray();
 
	for (int i = 0; i < arr.length; i++) {
		char current = arr[i];
		if (flag[current]) {
			result = Math.max(result, i - start);
			// the loop update the new start point
			// and reset flag array
			// for example, abccab, when it comes to 2nd c,
			// it update start from 0 to 3, reset flag for a,b
			for (int k = start; k < i; k++) {
				if (arr[k] == current) {
					start = k + 1; 
					break;
				}
				flag[arr[k]] = false;
			}
		} else {
			flag[current] = true;
		}
	}
 
	result = Math.max(arr.length - start, result);
 
	return result;
    }
}
