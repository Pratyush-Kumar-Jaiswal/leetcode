/*
Given an integer array nums, return the length of the longest strictly increasing 
subsequence
.

 

Example 1:

Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
Example 2:

Input: nums = [0,1,0,3,2,3]
Output: 4
Example 3:

Input: nums = [7,7,7,7,7,7,7]
Output: 1
 

Constraints:

1 <= nums.length <= 2500
-104 <= nums[i] <= 104
 

Follow up: Can you come up with an algorithm that runs in O(n log(n)) time complexity?


*/




class LengthOfLIS {
    public int lengthOfLIS(int[] arr) {
        int[] dp=new int[arr.length];
        dp[0]=arr[0];
        int len=1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>dp[len-1]){
                dp[len]=arr[i];
                len++;
            }
            else{
                int ith=Search(dp,0,len-1,arr[i]);
                dp[ith]=arr[i];
            }
        }
        return len;
    }
    private int Search(int[] dp, int si, int ei, int item) {
        int ans=0;
        while(si<=ei)
        {
            int mid=(si+ei)/2;
            if(dp[mid]>=item){
                ans=mid;
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return ans;
    }
}

