package com.dsa.scaller.tree.LCA;

import com.dsa.scaller.tree.TreeNode;

public class LCA {
    //Problem Description
    //Given a Binary Search Tree A. Also given are two nodes B and C. Find the lowest common ancestor of the two nodes.
    //
    //Note 1 :- It is guaranteed that the nodes B and C exist.
    //
    //Note 2 :- The LCA of B and C in A is the shared ancestor of B and C that is located farthest from the root.
    //
    //
    //
    //Problem Constraints
    //1 <= Number of nodes in binary tree <= 105
    //
    //1 <= B , C <= 105
    //
    //
    //
    //Input Format
    //First argument is a root node of the binary tree, A.
    //
    //Second argument is an integer B.
    //
    //Third argument is an integer C.
    //
    //
    //
    //Output Format
    //Return the LCA of the two nodes
    //
    //
    //
    //Example Input
    //Input 1:
    //
    //            15
    //          /    \
    //        12      20
    //        / \    /  \
    //       10  14  16  27
    //      /
    //     8
    //
    //     B = 8
    //     C = 20
    //Input 2:
    //
    //            8
    //           / \
    //          6  21
    //         / \
    //        1   7
    //
    //     B = 7
    //     C = 1
    //
    //
    //Example Output
    //Output 1:
    //
    // 15
    //Output 2:
    //
    // 6
    //
    //
    //Example Explanation
    //Explanation 1:
    //
    // The LCA of node 8 and 20 is the node 15.
    //Explanation 2:
    //
    // The LCA of node 7 and 1 is the node 6.

    public int findLCA(TreeNode A, int B, int C) {
        TreeNode temp = A;

        while (temp != null) {
            if (temp.val > B && temp.val > C) {
                temp = temp.left;
            } else if (temp.val < B && temp.val < C) {
                temp = temp.right;
            } else {
                return temp.val;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(12);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(14);
        root.left.left.left = new TreeNode(8);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(27);

        LCA solution = new LCA();
        int B = 8;
        int C = 20;
        int lca = solution.findLCA(root, B, C);

        System.out.println("Lowest Common Ancestor of " + B + " and " + C + " is: " + lca);
    }
}
