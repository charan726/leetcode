class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        int ct=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                ct++;
            }
            else{
                if(ct==1){
                    return -1;
                }
                else{
                    ans+=ct/3;
                    ct=ct%3;
                    if(ct>0){
                        ans++;
                    }
                }
                ct=1;
            }
        }
        if(ct==1){
            return -1;
        }
        ans+=ct/3;
        ct=ct%3;
        if(ct>0){
            ans++;
        }
        return ans;
    }
}
