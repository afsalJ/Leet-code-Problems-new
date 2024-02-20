class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums,0, nums.length-1);
    }
    TreeNode convert(int[] arr, int start, int end){
        if(start>end)return null;

        int mid=(start+end)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=convert(arr, start, mid-1);
        root.right=convert(arr, mid+1, end);
        return root;
    }
}