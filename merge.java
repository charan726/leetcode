class Solution {
    public int[][] merge(int[][] a) {
        Arrays.sort(a, Comparator.comparingInt(row -> row[0]));
        int ans[][]=new int[a.length][2];
        ans[0][0]=a[0][0];
        ans[0][1]=a[0][1];
        int k=1;
        for(int i=1;i<a.length;i++){
            if(ans[k-1][1]>=a[i][0]){
                ans[k-1][0]= ans[k-1][0]<a[i][0]?ans[k-1][0]:a[i][0];
                ans[k-1][1]=ans[k-1][1]>a[i][1]?ans[k-1][1]:a[i][1];
            }
            else{
                ans[k][0]=a[i][0];
                ans[k][1]=a[i][1];
                k++;
            }
        }
        int r[][]=new int[k][2];
        System.arraycopy(ans,0,r,0,k);
        
        return r;
    }
}
