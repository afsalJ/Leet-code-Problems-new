/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<TreeNode, Boolean> roots = new HashMap<>();
        HashMap<Integer, TreeNode> nodes = new HashMap<>();

        for(int[] arr: descriptions){
            TreeNode parent;
            if(nodes.containsKey(arr[0])){
                parent=nodes.get(arr[0]);
            }
            else{
                parent = new TreeNode(arr[0]);
                nodes.put(arr[0], parent);
            }
            if(!roots.containsKey(parent))roots.put(parent, true);

            TreeNode child;
            if(nodes.containsKey(arr[1])){
                child=nodes.get(arr[1]);
            }
            else{
                child=new TreeNode(arr[1]);
                nodes.put(arr[1], child);
            }
            roots.put(child, false);

            if(arr[2]==1){
                parent.left=child;
            }
            else{
                parent.right=child;
            }
        }

        TreeNode root = new TreeNode();
        for(TreeNode temp:roots.keySet()){
            if(roots.get(temp)){
                root=temp;
                break;
            }
        }

        return root;
    }
}