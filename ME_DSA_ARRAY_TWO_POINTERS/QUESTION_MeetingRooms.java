import java.util.*;

public class MeetingRooms {

    public int findNumRooms(int[][] intervals) {
       if (intervals == null || intervals.length == 0) {
            return 0;
        }

        // Sort the meetings by start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        // Initialize a min-heap to keep track of rooms required
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add the end time of the first meeting to the min-heap
        minHeap.offer(intervals[0][1]);

        // Iterate through each meeting
        for (int i = 1; i < intervals.length; i++) {
            int[] meeting = intervals[i];
            int earliestEndingMeeting = minHeap.peek();

            // If the start time of the current meeting is greater than or equal to
            // the end time of the earliest ending meeting, remove the earliest ending meeting
            // from the min-heap and add the current meeting's end time to the min-heap
            if (meeting[0] >= earliestEndingMeeting) {
                minHeap.poll();
            }

            // Add the current meeting's end time to the min-heap
            minHeap.offer(meeting[1]);
        }

        // The size of the min-heap at the end gives the minimum number of rooms required
        return minHeap.size();
        
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

        int result = new MeetingRooms().findNumRooms(nums);

        System.out.printf("%d", result);
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