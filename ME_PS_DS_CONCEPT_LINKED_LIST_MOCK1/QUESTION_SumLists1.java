/*
public class ListNode {
   public int val; 
   public ListNode next;
   public ListNode(int x) { val = x; next = null; }
}
*/
import java.io.*;
import java.util.*;
import crio.ds.List.ListNode;
class Solution {
  public static ListNode sumLists1( ListNode head1 , ListNode head2) {
        ListNode dummy = new ListNode(0); // Dummy node for the resultant list
        ListNode current = dummy; // Pointer for traversing the resultant list
        int carry = 0; // Carry from previous addition

        // Traverse both input lists until both are null and carry is zero
        while (head1 != null || head2 != null || carry != 0) {
            int sum = carry; // Initialize sum with carry

            // Add values from the first list if available
            if (head1 != null) {
                sum += head1.val;
                head1 = head1.next;
            }

            // Add values from the second list if available
            if (head2 != null) {
                sum += head2.val;
                head2 = head2.next;
            }

            // Update carry for next calculation
            carry = sum / 10;

            // Create a new node with the value of sum % 10 and add it to the resultant list
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return dummy.next; // Return the head of the resultant list (skipping the dummy node)

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