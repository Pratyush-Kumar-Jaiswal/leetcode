/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
*/

class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        generateParenthesis1(n,0, 0, "",list);
        return list;
    }
    public static void generateParenthesis1(int n, int open, int close, String s,List<String> list) {
        if(open==n&&close==n){
            list.add(s);
            return;
        }
        if (open < n) {
            generateParenthesis1(n, open + 1, close, s + "(",list);
        }
        if (close < open) {
            generateParenthesis1(n, open, close + 1, s + ")",list);
        }

    }
}
