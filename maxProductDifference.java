class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n<3){
            return 0;
        }
        return (nums[n-1]*nums[n-2])-(nums[0]*nums[1]);
    }
}
