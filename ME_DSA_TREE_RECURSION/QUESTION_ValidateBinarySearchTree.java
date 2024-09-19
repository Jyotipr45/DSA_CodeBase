import java.util.*;
import crio.ds.Tree.TreeNode;

/*
// Definition of TreeNode
public class TreeNode {
    public long val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode (long x) {
        val = x;
        left = null;
        right = null;
    }
}
*/


public class Solution {
    //  Validates whether the given binary tree is a valid binary search tree (BST).
    public boolean validateBinarySearchTree(TreeNode root) {
        // Initialize the previously visited node's value as the lowest possible value
        long[] prev = {Long.MIN_VALUE};  // Initialize with the lowest possible value
        // Perform inorder traversal
        return inorderTraversal(root, prev);
    }

    // Performs an inorder traversal of the binary tree to validate it as a valid BST.  
    private boolean inorderTraversal(TreeNode node, long[] prev) {
        // Base case: If the node is null, return true (empty subtree is a valid BST)
        if (node == null) return true;

        // Traverse left subtree
        if (!inorderTraversal(node.left, prev)) return false;

        // Check if current node's value is greater than the previous visited node's value
        if (node.val <= prev[0]) return false;

        // Update the previously visited node's value
        prev[0] = node.val;

        // Traverse right subtree
        return inorderTraversal(node.right, prev);
    }
}

/* 
Crio Methodology

Milestone 1: Understand the problem clearly
1. Ask questions & clarify the problem statement clearly.
2. Take an example or two to confirm your understanding of the input/output

Milestone 2: Finalize approach & execution plan
1. Understand what type of problem you are solving and see if you can recollect solving similar problems in the past
      a. Obvious logic (this would only test ability to convert logic to code)
      b. Figuring out logic
      c. Knowledge of specific algorithm, data structure or pattern
      d. Knowledge of specific domain or concepts
      e. Mapping real world into abstract concepts/data structures
2. Brainstorm multiple ways to solve the problem and pick one based on the TC/SC requirements
3. Get to a point where you can explain your approach to a 10 year old

Milestone 3 : Come up with an Instruction Manual for a 10 year old
1. Take a stab at the high-level logic & write it down like a detailed Instruction Manual for a 10 Year old where each line of the manual can be expanded into a logical line(s) of code.
2. Try to offload logic out of the main section as much as possible by delegating to functions.

Milestone 4: Code by expanding your 10 Year Olds "Instruction Manual
1. Run your code snippets at every logical step to test correctness (Helps avoid debugging larger pieces of code later)
2. Make sure you name the variables, functions clearly.
3. Use libraries as much as possible

Milestone 5: Prove that your code works using custom test cases
1. Make sure you check boundary conditions and other test cases you noted in Milestone 1
      a. If compiler is not available, dry run your code on a whiteboard or paper
2. Suggest optimizations if applicable during interviews
*/