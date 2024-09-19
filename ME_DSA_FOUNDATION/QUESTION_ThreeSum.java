import java.util.Scanner;
import java.util.*;

class ThreeSum {
    
    public List<List<Integer>> threeSum(Integer[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        // soritng the array 
        Arrays.sort(nums);

        // run a loop from entire nums array
        for(int i = 0; i < n; i++){
            // check a condition if i - 1 >= 0 and nums[i] = num[i - 1] and continue
            if(i - 1 >= 0 && nums[i] == nums[i - 1]){
               continue;
            }
           // initialize j as (i + 1) and k as (n - 1)
           int j = i + 1, k = n - 1;
            while(j < k){    
                // check a condition if j - 1 > i and nums[j] = num[j - 1] and 
                // j++, continue
                if(j - 1 > i && nums[j] == nums[j - 1]){
                    j++;
                    continue;
                }
                // take sum  = num[i] + nums[j] + nums[k]
                int sum = nums[i] + nums[j] + nums[k];
                // check a condition if sum = 0 , store result as 1D array and just increment j value by 1
                if(sum == 0){
                    // create list to add all the triplet
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    // finally add the triplet to result list
                    result.add(triplet);
                    j++;
                }else if(sum > 0){
                    k--; 
                }else{
                    j++;
                }
            }    
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        Integer nums[] = new Integer[n];
        for(Integer i = 0 ; i < n ;i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();

        List<List<Integer>> result = new ThreeSum().threeSum(nums);
        for (Integer i = 0; i < result.size(); ++i) {
            System.out.printf("%d %d %d\n", result.get(i).get(0), result.get(i).get(1), result.get(i).get(2));
        }
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