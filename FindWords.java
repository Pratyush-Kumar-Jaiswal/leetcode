/*
Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

 

Example 1:

Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]
Example 2:

Input: words = ["omk"]
Output: []
Example 3:

Input: words = ["adsdf","sfd"]
Output: ["adsdf","sfd"]
 

Constraints:

1 <= words.length <= 20
1 <= words[i].length <= 100
words[i] consists of English letters (both lowercase and uppercase). 
*/



class FindWords {
    public String[] findWords(String[] words) {
        
         HashMap <Character , Integer> rowId = new HashMap <>();
        String temp = "qwertyuiopQWERTYUIOP";
        for(char i : temp.toCharArray())
            rowId.put(i , 1);
        temp = "asdfghjklASDFGHJKL";
        for(char i : temp.toCharArray())
            rowId.put(i , 2);
        temp = "zxcvbnmZXCVBNM";
        for(char i : temp.toCharArray())
            rowId.put(i , 3);
        boolean same_row;
        List <String> result_list = new ArrayList<String>();
        for(String word : words)
        {
            same_row = true;
            for(int i = 1 ; i < word.length() ; i++)
            {
                if(rowId.get(word.charAt(i)) != rowId.get(word.charAt(0)))
                {
                    same_row = false;
                    break;
                }
            }
            if(same_row)
                    result_list.add(word);
        }
        String[] result = new String[result_list.size()];
        for(int i = 0 ; i < result.length ; i++)
            result[i] = result_list.get(i);
        return result;
    }
}
