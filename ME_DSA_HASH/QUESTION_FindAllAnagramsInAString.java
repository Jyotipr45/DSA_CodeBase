import java.util.*;

// Implement your solution here
class FindAllAnagramsInAString {

    public List<Integer> findAnagrams(String s, String p) {
        // create a list to store all the starting oint of anagrams
        List<Integer> result = new ArrayList<>();

        // check if the s and p size is 0 or there is no element in both to find anagrams then just retun the empty list
        if(s == null || s.length() == 0 || p == null || p.length() == 0) return result;

        // create to array to store the freq of two given array separately
        int[] targetFreq = new int[26];
        int[] windowFreq = new int[26];

        // store the target char freq
        for(char ch : p.toCharArray()) {
            targetFreq[ch - 'a']++;
        } 

        // intitialize left, right as '0' and count as length of the target String(p)
        int left = 0, right = 0, count = p.length();

        // run a while loop over the window string to find the anagrams
        while(right < s.length()) {
            char current = s.charAt(right);
            windowFreq[current - 'a']++;

            // update the freq of right pointer
            if(windowFreq[current - 'a'] <= targetFreq[current - 'a']) {
                count--;
            } 
            right++;

            // if the anagram is found just add the starting index to result
            if(count == 0) {
                result.add(left);
            }

            // now time to add the new incoming and delete the outcoming (or)
            // move left pointer to starting point of next window
            if(right - left == p.length()) {
                char leftChar = s.charAt(left);
                windowFreq[leftChar - 'a']--;   // Decrement frequency for character leaving the window
                if(windowFreq[leftChar - 'a'] < targetFreq[leftChar - 'a']) {
                    count++;
                }
                left++;     // move left pointer
            }
        }

        // return the result
        return result;
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    String[] input = new String[2]; 
	    input = scanner.nextLine().split(" ");
        String s = input[0];
        String p = input[1];
        scanner.close();

        List<Integer> result = new FindAllAnagramsInAString().findAnagrams(s,p);
	    System.out.println(result.size());
        for (Integer i = 0; i < result.size(); ++i) {
            System.out.printf("%d ", result.get(i));
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