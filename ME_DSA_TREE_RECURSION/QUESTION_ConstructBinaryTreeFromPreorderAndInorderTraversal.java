// Definition of TreeNode
class TreeNode {
    public long val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode (long x) {
        val = x;
        left = null;
        right = null;
    }
}

public class Solution {

    public TreeNode constructBinaryTreeFromPreorderAndInorderTraversal(int[] preorder, int[] inorder) {
     // Check if either of the traversals is null or empty, or their lengths don't match
        if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0 || preorder.length != inorder.length) {
            return null; // If any of these conditions are true, return null as it's not possible to construct the tree
        }
        
        // Call the helper method to construct the binary tree recursively
        return construct(preorder, inorder, 0, 0, inorder.length - 1);
    }
    
    // Helper method to construct the binary tree recursively
    private TreeNode construct(int[] preorder, int[] inorder, int preIndex, int inStart, int inEnd) {
        // Base case: If preorder index exceeds array length or inorder start index is greater than end index
        if (preIndex >= preorder.length || inStart > inEnd) {
            return null; // Return null indicating no more nodes to process
        }
        
        // Create a new TreeNode with the value at the current preorder index
        TreeNode root = new TreeNode(preorder[preIndex]);
        
        // Find the index of current root node's value in the inorder traversal
        int inIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == preorder[preIndex]) {
                inIndex = i; // Store the index where root's value is found in inorder traversal
                break;
            }
        }
        
        // Recursively construct the left subtree using the elements before the root in inorder traversal
        // Increment the preorder index by 1 to move to the next element in preorder traversal
        // Inorder start index remains the same, and inorder end index becomes the index of root in inorder traversal - 1
        root.left = construct(preorder, inorder, preIndex + 1, inStart, inIndex - 1);
        
        // Recursively construct the right subtree using the elements after the root in inorder traversal
        // Increment the preorder index by the number of elements processed in the left subtree plus 1
        // Inorder start index becomes the index of root in inorder traversal + 1, and inorder end index remains the same
        root.right = construct(preorder, inorder, preIndex + inIndex - inStart + 1, inIndex + 1, inEnd);
        
        // Return the constructed root
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