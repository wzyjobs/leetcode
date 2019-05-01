package com.ericgarvin.leetcode.easy.tree;


/**
 * 101.对称二叉树
 * 给定一个二叉树，检查它是否是镜像对称的。
 * <p>
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 * <p>
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 * <p>
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 * 说明:
 * <p>
 * 如果你可以运用递归和迭代两种方法解决这个问题，会很加分。
 */
public class SymmetricTree_101 {

    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    private boolean check(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) {
            return true;
        }
        if (leftNode == null || rightNode == null) {
            return false;
        }
        return leftNode.val == rightNode.val
                && check(leftNode.left, rightNode.right)
                && check(leftNode.right, rightNode.left);
    }

    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(1);
        rootNode.left = new TreeNode(2);
        rootNode.right = new TreeNode(2);
        rootNode.left.left = new TreeNode(4);
        rootNode.left.right = new TreeNode(3);
        rootNode.right.left = new TreeNode(3);
        rootNode.right.right = new TreeNode(4);


        boolean symmetric = new SymmetricTree_101().isSymmetric(rootNode);
        System.out.println(symmetric);
    }
}
