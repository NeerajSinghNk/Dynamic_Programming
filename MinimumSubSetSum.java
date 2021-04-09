/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whoami
 */
public class MinimumSubSetSum {

    /**
     * @param args the command line arguments
     */
    
    public static int miniMumSubSetSumDiffrence(int[] arr, int n){
        
        int sum=0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        
        boolean[][] dp = new boolean[n+1][sum+1];
        
        for(int i=0;i<=n;i++){
            dp[0][i] = true;
        }
        
        for(int i=1;i<=sum;i++){
            dp[i][0] = false;
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                dp[i][j] = dp[i-1][j];
                
                if(j>=arr[i-1]){
                    dp[i][j] |= dp[i-1][j-arr[i-1]];
                }
            }
        }
        
         // Initialize difference of two sums.
        int diff = Integer.MAX_VALUE;
        
        return 
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
