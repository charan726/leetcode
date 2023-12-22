class Solution {
    public int maxScore(String s) {
        int ones=0;
        for(char o:s.toCharArray()){
            if(o=='1'){
                ones++;
            }
        }
        int zero=0;
        int ans=0;
        int ct=0;
        for(char o:s.toCharArray()){
            ct++;
            if(ct==s.length()){
                break;
            }
            if(o=='0'){
                zero++;
            }
            if(o=='1'){
                ones--;
                if(ones<0){
                    // ones=0;
                }
            }
            if(ans< (ones+zero)){
                ans=ones+zero;
            }
            
        }
        return ans;
    }
}
