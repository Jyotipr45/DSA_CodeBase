import java.util.*;

public class Solution {

    public static List<Integer> filterEven(List<Integer> inputList) {
         List<Integer> outputList = new LinkedList<>();

        // Iterate over the inputList
        for (Integer num : inputList) {
            // Check if the number is odd
            if (num % 2 != 0) {
                // If odd, add it to the outputList
                outputList.add(num);
            }
        }

        return outputList;
    }

    public static void main(String args[]) {
        List<Integer> inputList = new LinkedList<>(Arrays.asList(1, 2, 6, 7, 9, 10));
        List<Integer> expectedOutputList = new LinkedList<>(Arrays.asList(1, 7, 9));
        assert filterEven(inputList).equals(expectedOutputList) : "Expect [1,7,9] from [1,2,6,7,9,10]";
        System.out.println("All test cases in main function passed");

    }
}

