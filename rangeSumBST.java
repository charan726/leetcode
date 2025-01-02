class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null){
            return 0;
        }
        int ans=0;
        if(root.val>=low && root.val<=high)
            ans+=root.val;
        if(low<root.val)
            ans+=rangeSumBST(root.left,low,high);
        if(high>root.val)
            ans+=rangeSumBST(root.right,low,high);
        return ans;
    }
}
