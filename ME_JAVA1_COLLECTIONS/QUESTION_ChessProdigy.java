import java.util.*;

public class Solution {

    static List chessProdigy(int[] rating) {
         List<Integer> prodigies = new ArrayList<>();
        int sum = 0;

        // Iterate in reverse order from end to start of the list
        for (int i = rating.length - 1; i >= 0; i--) {
            // Check if the current player's rating is greater than the sum
            if (rating[i] > sum) {
                // If greater, add it to the list of chess prodigies
                prodigies.add(rating[i]);
            }

            // Update the sum with the current player's rating
            sum += rating[i];
        }

        // Reverse the list to get the original order
        Collections.reverse(prodigies);

        return prodigies;
    }

    public static void main(String args[]) {

        assert Arrays.asList(27, 8, 3).equals(chessProdigy(new int[] { 16, 27, 1, 3, 8, 3 })) : "Expect {27, 8, 3} for array={16, 27, 1, 3, 8, 3}";
        System.out.println("All test cases in main function passed");

    }
}

