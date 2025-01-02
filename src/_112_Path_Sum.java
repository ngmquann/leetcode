import learn.Tree.TreeNode;

public class _112_Path_Sum {
    public boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }

    public boolean duyet(TreeNode currNode, int currSum, int target) {
        if (currNode == null) return false;

        currSum += currNode.val;
        if(isLeaf(currNode)) return target == currSum;

        boolean left = duyet(currNode.left, currSum, target);
        boolean right = duyet(currNode.right, currSum, target);

        return left || right;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return duyet(root, 0, targetSum);
    }
}
