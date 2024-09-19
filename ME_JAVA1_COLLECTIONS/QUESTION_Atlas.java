import java.util.*;

public class Solution {

    public static List<String> atlas(List<String> words) {
        List<String> output = new ArrayList<>();

        // Iterate through the words
        for (String word : words) {
            // Check if the current word is not empty and the output list is not empty
            if (!word.isEmpty() && (output.isEmpty() || output.get(output.size() - 1).charAt(output.get(output.size() - 1).length() - 1) == word.charAt(0))) {
                // Add the current word to the output list
                output.add(word);
            } else {
                // If the current word is empty or the condition is not met, end the game
                break;
            }
        }


        return output;


    }

    public static void main(String args[]) {
        ArrayList<String> words = new ArrayList<String>(
                Arrays.asList("budapest", "texas", "seattle", "edinburgh", "hokkaido"));
        ArrayList<String> expected = new ArrayList<String>(
                Arrays.asList("budapest", "texas", "seattle", "edinburgh", "hokkaido"));
        assert atlas(words).equals(expected) : "Expect [\"budapest\", \"texas\", \"seattle\", \"edinburgh\", \"hokkaido\"] for list = [\"budapest\", \"texas\", \"seattle\", \"edinburgh\", \"hokkaido\"]" ;
        System.out.println("All test cases in main function passed");
    }
}

