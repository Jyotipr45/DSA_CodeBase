import crio.ds.List.ListNode;
import java.util.*;

/*
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
        next = null;
    }
}

Use new ListNode(data) to create new node
*/
class Solution {

    public List<ListNode> linkedListSplit(ListNode head) {
        ListNode oddHead = null, oddTail = null;
        ListNode evenHead = null, evenTail = null;
        ListNode current = head;

        // Lists to store separated odd and even nodes
        List<ListNode> result = new ArrayList<>();

        while (current != null) {
            // Check if the current node's value is odd
            if (current.val % 2 == 1) {
                // Append the current node to the odd list
                if (oddHead == null) {
                    // If oddHead is null, set it as both the head and tail
                    oddHead = oddTail = current;
                } else {
                    // Otherwise, add the current node to the tail and update the tail
                    oddTail.next = current;
                    oddTail = oddTail.next;
                }

            } else {
                // Append the current node to the even list
                if (evenHead == null) {
                    // If evenHead is null, set it as both the head and tail
                    evenHead = evenTail = current;
                } else {
                    // Otherwise, add the current node to the tail and update the tail
                    evenTail.next = current;
                    evenTail = evenTail.next;
                }
            }
            
            // Move to the next node in the original list
            current = current.next;
        }

        // Set the next of the last nodes to null to terminate the lists
        if (oddTail != null) {
            oddTail.next = null;
        }
        if (evenTail != null) {
            evenTail.next = null;
        }

        // Add the heads of the odd and even lists to the result
        result.add(oddHead);
        result.add(evenHead);

        // Return the result containing separated odd and even lists
        return result;

    }
};
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