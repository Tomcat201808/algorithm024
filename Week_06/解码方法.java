/**
分为4中情况
1.如果i-1位于i位能组成10-26之间的数：
  1）如果组成的数是10或者20 ，那么dp[i]=dp[i-2]
  2）如果组成的数是11-26（不含20） ，那么dp[i]=dp[i-1]+dp[i-2]
2.如果i-1位于i位不能组成10-26之间的数：
  1）如果第i位是0：不可编码 return 0；
  2）如果第i位不是0：dp[i]=dp[i-1]
**/

class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if(n == 0) return 0;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for(int i = 1; i < n; i++){
            
            if(s.charAt(i-1) == '1' || s.charAt(i-1) == '2' && s.charAt(i) <'7'){
                //如果是20、10
                if(s.charAt(i) == '0') dp[i + 1] = dp[i - 1];
                //如果是11-19、21-26
                else dp[i + 1] = dp[i] + dp[i - 1];
            }else if(s.charAt(i) == '0'){
                //如果是0、30、40、50
                return 0;
            }else{
                //i-1和i无法构成一个字母
                dp[i + 1] = dp[i];
            }
        }
        return dp[n];
    }
}

