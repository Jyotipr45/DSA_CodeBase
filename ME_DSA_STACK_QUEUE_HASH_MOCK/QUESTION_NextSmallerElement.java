import java.util.*;


class NextSmallerElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int [] ans = nextSmallerElement(arr, n);
		for (int i = 0; i < ans.length; i++)
			System.out.print(ans[i] + " ");
    }

    static int [] nextSmallerElement(int arr[], int n){
        
        int[] nextSmaller = new int[n]; // Array to store next smaller elements
        Stack<Integer> stack = new Stack<>(); // Stack to keep track of elements
        
        // Iterate through the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack until we find an element smaller than the current element
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            
            // If the stack is empty, it means there's no smaller element to the right
            // Otherwise, the top element of the stack is the next smaller element
            if (stack.isEmpty()) {
                nextSmaller[i] = -1;
            } else {
                nextSmaller[i] = stack.peek();
            }
            
            // Push the current element onto the stack
            stack.push(arr[i]);
        }
        
        return nextSmaller;
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