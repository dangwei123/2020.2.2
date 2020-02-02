class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(sum>0){
                sum+=nums[i];
            }else{
                sum=nums[i];
            }
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
    }
}

class Solution {
    public int climbStairs(int n) {
        if(n<3){
            return n;
        }
        int f1=1;
        int f2=2;
        int f3=0;
        for(int i=3;i<=n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }
}


class Solution {
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int[] res=new int[nums.length+1];
        res[1]=nums[0];
        for(int i=2;i<res.length;i++){
            res[i]=Math.max(res[i-1],res[i-2]+nums[i-1]);
        }
        return res[nums.length];
    }
}

class Solution {
    public boolean isSubsequence(String s, String t) {
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        for(int i=0;i<s.length();i++){
            s1.push(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            s2.push(t.charAt(i));
        }
        while(!s1.empty()&&!s2.empty()){
            if(s1.peek()==s2.peek()){
                s1.pop();
                s2.pop();
            }else{
                s2.pop();
            }
        }
        return s1.empty();
    }
}

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<dp.length;i++){
            dp[i]=Math.min(dp[i-1],dp[i-2])+cost[i];
        }
        return Math.min(dp[cost.length-2],dp[cost.length-1]);
    }
}

