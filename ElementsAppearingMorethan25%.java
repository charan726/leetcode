class Solution {
    public int findSpecialInteger(int[] arr) {
        int ct=1,ans=arr[0];
        int x=arr.length/4;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                ct++;
            }
            else{
                if(x<ct){
                    return arr[i-1];
                }
                ct=1;
            }
        }
        if(x<ct){
            ans= arr[arr.length-1];
        }
        return ans;
    }
}
