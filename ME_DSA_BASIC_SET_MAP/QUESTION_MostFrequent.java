import java.util.*;

class MostFrequent {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Object[] ans = mostFrequent(s);
        System.out.println(ans[0] + " " + ans[1]);
    }

    // TODO: Implement this method
    static Object[] mostFrequent(String s) {

        // create an empty hashmap to store the every individual frquency of charachter present in String
        HashMap<Character, Integer> hm = new HashMap<>();

        // run a loop over string of every character
        for(char ch : s.toCharArray()){
           int freq = hm.getOrDefault(ch, 0);
           hm.put(ch, freq + 1);
        } 
        
        // initialize character ans and maxFreq as 0
        Character ans = '0';
        Integer maxFreq = 0;
        //run loop over every element present in  hashmap and compare with maxfreq  and freq of current element 
        for(Character ch : hm.keySet()){
           int freq = hm.get(ch);
           // check if freq is greater than max freq the update the maxFreq 
           if(freq > maxFreq){
              ans = ch;
              maxFreq = freq;
           }else if(freq == maxFreq){   // if both freq and maxfreq is same 
               if(ch < ans){            // then check the charcter with min ascii value and then update the char  
                  ans = ch;
               }
           }
        }

        // create a object array for storing and returning the char and theie frequency
        Object[] arr = {ans, maxFreq};

        return arr; 
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