import java.io.*;
import java.util.*;
import crio.ds.List.ListNode;
/*
// Definition for ListNode
public class ListNode {

    public int val;
    public ListNode next;
    ListNode() {}
    ListNode(int x) {
        val = x;
        next = null;
    }
};
*/
class Solution {
	public static ListNode listIntersectionPoint(ListNode head1, ListNode head2) {
	 // Edge case: if either list is null, there is no intersection
        if (head1 == null || head2 == null) {
            return null;
        }

        int len1 = getLength(head1); // Length of the first list
        int len2 = getLength(head2); // Length of the second list

        ListNode ptr1 = head1;
        ListNode ptr2 = head2;

        // Traverse the longer list till both lists have equal remaining length
        while (len1 > len2) {
            ptr1 = ptr1.next;
            len1--;
        }
        while (len2 > len1) {
            ptr2 = ptr2.next;
            len2--;
        }

        // Traverse both lists simultaneously until intersection point is found
        while (ptr1 != null && ptr2 != null) {
            if (ptr1 == ptr2) {
                return ptr1; // Intersection point found
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        // No intersection point found
        return null;
    }

    // Helper function to calculate the length of a linked list
    private static int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
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