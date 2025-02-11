import java.util.*;
import crio.ds.List.ListNode;

/*
public class ListNode {
   public int val; 
   public ListNode next;
   public ListNode(int x) { val = x; next = null; }
}
*/

class Solution{

	public ListNode reverseEvenElements(ListNode head)
	{
		if (head == null || head.next == null) {
            return head; // No need to reverse if list has 0 or 1 node
        }

        ListNode dummy = new ListNode(0); // Dummy node for the resultant list
        dummy.next = head;
        ListNode prevOdd = dummy; // Pointer to the node before the start of the current even sublist

        // Iterate through the list
        while (head != null) {
            if (head.val % 2 == 0) {
                // Encountered even value
                ListNode evenSublistEnd = head;

                // Move head pointer to the end of the even sublist
                while (evenSublistEnd != null && evenSublistEnd.val % 2 == 0) {
                    evenSublistEnd = evenSublistEnd.next;
                }

                // Reverse the even sublist and connect it back to the original list
                ListNode prev = null;
                ListNode current = head;
                while (current != evenSublistEnd) {
                    ListNode nextNode = current.next;
                    current.next = prev;
                    prev = current;
                    current = nextNode;
                }

                prevOdd.next = prev; // Connect the previous odd node to the new head of the reversed sublist
                head.next = evenSublistEnd; // Connect the end of the reversed sublist to the next node after it
                prevOdd = head; // Update prevOdd for the next iteration
                head = evenSublistEnd; // Move head to the next node after the reversed sublist
            } else {
                prevOdd = head;
                head = head.next;
            }
        }

        return dummy.next; // Return the head of the modified list (skipping the dummy node)

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