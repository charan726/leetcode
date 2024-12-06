class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int sum=0;
        int ct=0;
        for(int i=1;i<=n;i++){
            if(contains(banned,i)){
                sum+=i;
                if(sum<=maxSum) ct++;
                else break;
            }
        }
        return ct;
    }
    public boolean contains(int[] b,int x){
        for(int i:b){
            if(i==x) return false;
        }
        return true;
    }
}
