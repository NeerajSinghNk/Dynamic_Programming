/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whoami
 */
public class CountSubSet {

    /**
     * @param args the command line arguments
     */
    
    public static int countSubSet(int[] arr, int n, int sum){
    
        int[][] dp = new int[sum+1][n+1];
        
        for(int i=0;i<=n;i++){
            dp[0][i] = 1;
        }
        
        for(int i=1;i<=sum;i++){
            dp[i][0] = 0;
        }
        
        for(int i=1;i<=sum;i++){
            for(int j=1;j<=n;j++){
                dp[i][j] = dp[i][j-1];
                
                if(i>=arr[j-1]){
                    dp[i][j] = dp[i][j] + dp[i - arr[j-1]][j-1];
                }
            }   
        }
        return dp[sum][n];
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr = {2,3,5,6,8,10};
        int n = arr.length;
        int sum =10;
        System.out.println(countSubSet(arr, n, sum));
    }
    
}
