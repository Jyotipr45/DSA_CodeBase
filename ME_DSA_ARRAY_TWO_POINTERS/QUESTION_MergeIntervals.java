
import java.util.*;

class MergeIntervals {

    public int[][] mergeIntervals(int[][] intervals) {
       // length of the intervals 
       int n = intervals.length;

       // sort the array using Comparator 
       Arrays.sort(intervals, new Comparator<int[]>() {
           public int compare(int[] a, int[] b) {
               return a[0] - b[0];
           }
       });

       // create a list of list with type integer to store all the merged intervals
       List<List<Integer>> ans = new ArrayList<>();

       // run a loop from strating from 0 till last of the intervals
        for(int i = 0; i < n; i++){
            // If there are no merged intervals yet or if the start time of the current interval is greater
            // than the end time of the last merged interval, add the current interval as a new merged interval.
            // Otherwise, merge the current interval with the last merged interval by updating its end time.
            if(ans.isEmpty() || intervals[i][0] > ans.get(ans.size() - 1).get(1)){
                ans.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            } else {
                ans.get(ans.size() - 1).set(1, Math.max(ans.get(ans.size() - 1).get(1), intervals[i][1]));
            }
        }
       // create a 2D array to store all the merged intervals from ans and return to method
       int[][] result = new int[ans.size()][2];

       // run a loop and store all the ans into 2D array
        for(int i = 0; i < ans.size(); i++) {
            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);
        }
       
       // return the result
       return result;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] nums = new int[n][2];

        for(int i = 0 ; i < n ;i++) {
            nums[i][0] = scanner.nextInt();
            nums[i][1] = scanner.nextInt();
        }

        int[][] results = new MergeIntervals().mergeIntervals(nums);

        for (int i = 0; i < results.length; ++i) {
            System.out.printf("%d %d\n", results[i][0], results[i][1]);
        }
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