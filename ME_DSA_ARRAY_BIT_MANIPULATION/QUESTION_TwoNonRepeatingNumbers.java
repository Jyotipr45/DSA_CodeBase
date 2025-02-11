import java.util.*;

class TwoNonRepeatingNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int ans[] = twoNonRepeatingNumbers(nums);
        System.out.println(ans[0]+" "+ans[1]);
        sc.close();
    }

    static boolean hasOneAtDiff(int num, int diffPosition) {

        int mask = (1<<diffPosition);

        return (num&mask) == mask;

    }

 

    static int findDiff(int num) {

        int diffPosition = 0;

        while ((num&1)==0) {

            diffPosition++;

            num = (num>>1);

        } 

        return diffPosition;

    }

    static int[] twoNonRepeatingNumbers(int[] nums) {
        // 1. Xor all the numbers in a (a = e1^e2)

        int a = 0;

        for (int num: nums) {

            a = (a^num);

        }

 

        // 2. Find out the diff bit between e1 and e2

        int diffPosition = findDiff(a);

 

        // 3. Separate the elements on the basis of diff bit

        int b1=0, b2=0;

        for (int num: nums) {

            if (hasOneAtDiff(num, diffPosition)) {

                b1 = (b1^num);

            } else {

                b2 = (b2^num);

            }

        }

        

         // 4. Return min and max

        int min = Math.min(b1,b2);

        int max = Math.max(b1, b2);

        return new int[] {min, max};
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