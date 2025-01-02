class Solution {
    public int[][] imageSmoother(int[][] img) {
        int n=img.length;
        int m=img[0].length;
        int ans[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j]=sol(img,i,j,n,m);
            }
        }
        return ans;
    }
    public int sol(int[][] img,int x,int y,int n,int m){
        int sum=0,ct=0;
        int t= x==0?x:x-1;
        int b= x==n-1?x:x+1;
        int l= y==0?y:y-1;
        int r= y==m-1?y:y+1;
        for(int i=t;i<=b;i++){
            for(int j=l;j<=r;j++){
                sum+=img[i][j];
                ct++;
            }
        }
        return (int)(sum/ct);
    }
}
