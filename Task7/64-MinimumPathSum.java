/*
using DP
*/

class Solution {
    public int minPathSum(int[][] grid) {
        int rowNum = grid.length;
        if(rowNum == 0) return 0;
        int colNum = grid[0].length;
        int[][] dp = new int[rowNum][colNum];
        for(int i = 0; i < rowNum; i++){
            for(int j = 0 ;j < colNum; j++)
                dp[i][j] = -1;
        }
        dp[0][0] = grid[0][0];
        for(int i = 0; i < rowNum; i++){
            for(int j = 0; j < colNum; j++){
                if(i != rowNum - 1){
                    dp[i + 1][j] = (dp[i + 1][j] == -1) ? dp[i][j] + grid[i + 1][j] : Math.min(dp[i + 1][j], dp[i][j] + grid[i + 1][j]);
                }
                if(j != colNum - 1){
                    dp[i][j + 1] = (dp[i][j + 1] == -1) ? dp[i][j] + grid[i][j + 1] : Math.min(dp[i][j + 1], dp[i][j] + grid[i][j + 1]);
                }
            }
        }
        return dp[rowNum - 1][colNum - 1];
    }
}