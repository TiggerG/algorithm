package dp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：liubaosong
 * @date ：Created in 2020/11/13 14:41
 * @description：动态规划
 */
public class Dp20201113 {
    /**
     * 三角形的最小路径和 dp求解
     */
    public static int minimumTotal(List<List<Integer>> triangle){
        int n = triangle.size();
        //dp[i][j] =表示从点（i,j） 到底部的最小路径和
        int[][] dp = new int[n+1][n+1];
        for (int i = n-1; i >= 0; i--){
            for(int j = 0;j <= i; j++){
                dp[i][j] = Math.min(dp[i+1][j],dp[i+1][j+1]) + triangle.get(i).get(j);
            }
        }
        return dp[0][0];
    }
    /**
     * 最小路径之和 dp[i][j] 表示dp （0,0） 到(i,j) 的最小路径和   dp[i][j] = min(dp[i,j-1, dp[i-1][j]) + tar[i][j]  所以 从左上角到右下角的最小路径和 就是dp[m-1][n-1] (m 代表行数 n代表列数)
     *
     */
    public static int minPathSum(int [][] grid){
        if (grid == null || grid.length == 0 || grid[0].length ==0){
            return 0;
        }
        //行
        int m = grid.length;
        //列
        int n = grid[0].length;
        int [][] dp = new int[m][n];
        dp[0][0] = grid[0][0];

        //三种情况
        for (int i = 1; i < m; i++){
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for (int j = 1; j < n; j++){
            dp[0][j] = dp[0][j-1] + grid[0][j];
        }
        for (int i =1 ;i < m; i++){
            for (int j = 1; j < n; j++){
                dp[i][j] = Math.min(dp[i][j-1], dp[i-1][j]) + grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }

    /**
     * 打家劫舍 dp[i] 为偷取到第i家时(不含第i家) 获取的最大现金数 dp[i] = max(dp[i-2]+num[i],dp[i-1])
     */
    public static int rob(int[] nums){
        if (nums == null || nums.length == 0){
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = nums[1];
        for (int i = 2; i < nums.length; i++){
            dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
       return dp[nums.length-1];
    }

    @Test
    public void test1(){
        int[][] g = {{1,3,1},{1,5,1},{4,2,1}};
        int i = minPathSum(g);
        System.out.println(i);
    }
    @Test
    public void test2(){
        int[] a = {1,2,3,1};
        int rob = rob(a);
        System.out.println(rob);
    }



}
