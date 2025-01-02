class Solution {
    public int numberOfBeams(String[] bank) {
        int cur=0,prev=0,ans=0;
        for(String s:bank){
            for(char c:s.toCharArray()){
                if(c=='1'){
                    cur++;
                }
            }
            ans+=cur*prev;
            if(cur>0){
                prev=cur;
                cur=0;
            }
        }
        return ans;
    }
}
