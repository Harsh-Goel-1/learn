import java.util.*;












class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "aaabbbccc";
        System.out.println(sol.minCut(s));
    }
    public int minCut(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                dp[i][j] = isPalindrome(s, i, j);
            }
        }
        return f(dp, 0, n - 1) - 1;
    }
    int f(boolean[][] dp, int i, int j) {
        if(i > j) {
            return 0;
        }
        int it = 0;
        while(it <= j - i) {
            int a = i, b = j - it;
            while(b <= j) {
                if(dp[a][b]) {
                    return 1 + f(dp, i, a - 1) + f(dp, b + 1, j);
                }
                a++;
                b++;
            }
            it++;
        }
        return 0;
    }
    public boolean isPalindrome(String str, int i, int j) {
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}