class Solution {
    public int minExtraChar(String s, String[] str) {
        HashSet<String> set = new HashSet<>();
        for (String word : str) {
            set.add(word);
        }
        
        int n = s.length();
        int[] dp = new int[n + 1];
        
        for (int i = 0; i <= n; i++) {
            dp[i] = i;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (set.contains(s.substring(i, j))) {
                    dp[j] = Math.min(dp[j], dp[i]);
                }
            }
            dp[i + 1] = Math.min(dp[i + 1], dp[i] + 1);
        }
        
        return dp[n];
    }
}