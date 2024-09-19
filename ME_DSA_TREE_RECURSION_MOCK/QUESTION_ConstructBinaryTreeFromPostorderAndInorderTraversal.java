import java.util.HashMap;
import java.util.Map;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}



public class Solution {

    // Function to construct a binary tree from postorder and inorder traversals
    public TreeNode constructBinaryTreeFromPostorderAndInorderTraversal(int[] postorder, int[] inorder) {
        // Create a hashmap to store the indices of elements in the inorder traversal
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }
        // Call the helper function with appropriate parameters
        return buildTree(postorder, inorder, 0, postorder.length - 1, 0, inorder.length - 1, indexMap);
    }

    // Helper function to recursively build the binary tree
    private TreeNode buildTree(int[] postorder, int[] inorder, int postStart, int postEnd, int inStart, int inEnd,
            Map<Integer, Integer> indexMap) {
        // Base case: If the indices are invalid, return null
        if (postStart > postEnd || inStart > inEnd) {
            return null;
        }
        // Create a new TreeNode with the value of the root
        TreeNode root = new TreeNode(postorder[postEnd]);
        // Find the index of the root value in the inorder traversal using the hashmap
        int rootIndexInorder = indexMap.get(root.val);
        // Calculate the size of the right subtree
        int rightSubtreeSize = inEnd - rootIndexInorder;
        // Recursively build the right subtree
        root.right = buildTree(postorder, inorder, postEnd - rightSubtreeSize, postEnd - 1, rootIndexInorder + 1,
                inEnd, indexMap);
        // Recursively build the left subtree
        root.left = buildTree(postorder, inorder, postStart, postEnd - rightSubtreeSize - 1, inStart,
                rootIndexInorder - 1, indexMap);
        // Return the root of the current subtree
        return root;
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