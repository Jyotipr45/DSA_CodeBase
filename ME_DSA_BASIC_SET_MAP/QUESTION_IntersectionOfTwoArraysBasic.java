import java.io.*;
import java.util.*;


class IntersectionOfTwoArraysBasic{
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        int m = sc.nextInt();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }
        List<Integer> result = intersectionOfTwoArraysBasic(n,a,m,b);
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        for (Integer x : result) {
            output.write(x+" ");
        }
        output.flush();
    }

    static List<Integer> intersectionOfTwoArraysBasic(int n, List<Integer>a, int m, List<Integer>b){
        // Create a empty list to store the result
        List<Integer> result = new ArrayList<>();
        //create a empty map to store every elements frequencies
        HashMap<Integer, Integer> hm = new HashMap<>();
        // run a loop over list a to find the frequencies of element 
        for(int ele : a){
            int oldFreq = hm.getOrDefault(ele, 0);
            hm.put(ele, oldFreq + 1);
        }

        // run a loop over list b to find the frequencies of every element and check the intersection of elements
        for(int ele : b){
           int freq = hm.getOrDefault(ele, 0);
           if(freq > 0){
              result.add(ele);
              hm.put(ele, freq - 1);
           }
        }
        // after find out the result just sort the array
        Collections.sort(result);

        //return the result
        return result;
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