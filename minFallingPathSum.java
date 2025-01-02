class Solution {
    
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=Integer.MIN_VALUE;
            }
        }
        if(n==1&&m==1){
            return matrix[0][0];
        }
        if(n==1){
            Arrays.sort(matrix[0]);
            return matrix[0][0];
        }
        if(m==1){
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                if(min>matrix[i][0]){
                    min=matrix[i][0];
                }
            }
            return min;
        }
        int ans=Integer.MAX_VALUE;
        
        for(int i=0;i<m;i++){
            ans=Math.min(ans,sol(matrix,i,0,dp));
        }
        return ans;
    }
    public static int sol(int[][] a,int y,int x,int[][] dp){
        int n=a.length;
        int m=a[0].length;
        int temp=a[x][y];
        if(dp[x][y]!=Integer.MIN_VALUE){
            return temp+dp[x][y];
        }
        if(x==n-2){
            if(y==0){
                dp[x][y]=Math.min(a[x+1][y],a[x+1][y+1]);
                return temp+dp[x][y];
            }
            else if(y==m-1){
                dp[x][y]=Math.min(a[x+1][y],a[x+1][y-1]);
                return temp+dp[x][y];
            }
            else{
                dp[x][y]=Math.min(Math.min(a[x+1][y],a[x+1][y+1]),a[x+1][y-1]);
                return temp+dp[x][y];
            }
        }
        if(y==0){
            dp[x][y]=Math.min(sol(a,y,x+1,dp),sol(a,y+1,x+1,dp));
            return temp+dp[x][y];
        }
        else if(y==m-1){
            dp[x][y]=Math.min(sol(a,y,x+1,dp),sol(a,y-1,x+1,dp));
            return temp+dp[x][y];
        }
        else{
            dp[x][y]=Math.min(Math.min(sol(a,y,x+1,dp),sol(a,y-1,x+1,dp)),sol(a,y+1,x+1,dp));
            return temp+dp[x][y];
        }
    }
}
