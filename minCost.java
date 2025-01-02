class Solution {
    public int minCost(String colors, int[] nt) {
        int n=colors.length();
        int x=0;
        int y=0;
        int ct=1,ans=0;
        for(int i=1;i<n;i++){
            if(colors.charAt(i)==colors.charAt(i-1)){
                ct++;
                y=i;
                continue;
            }
            else{
                if(ct>1){
                    ans+=fun(nt,x,y);
                }
                x=i;
                ct=1;
            }
        }
        if(ct>1){
            ans+=fun(nt,x,y);
        }
        return ans;
    }
    public int fun(int[] a,int x,int y){
        int sum=0,max=0;
        for(int i=x;i<=y;i++){
            sum+=a[i];
            if(max<a[i]){
                max=a[i];
            }
        }
        return sum-max;
    }
}
