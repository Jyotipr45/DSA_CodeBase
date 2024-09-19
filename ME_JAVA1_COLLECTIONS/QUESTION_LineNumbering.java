import java.util.*;

public class Solution {

    static List<String> lineNumbering(List<String> lines) {
       List<String> output = new ArrayList<>();

        // Iterate through the lines
        for (int i = 0; i < lines.size(); i++) {
            // Concatenate the line number with the current line
            String lineNumberedString = (i + 1) + " " + lines.get(i);
            // Add the lineNumberedString to the output list
            output.add(lineNumberedString);
        }

        return output;
    }

    public static void main(String args[]) {

      assert (lineNumbering(Arrays.asList("Hi", "Hello", "Hey")).equals(Arrays.asList("1 Hi", "2 Hello", "3 Hey"))) : "Expect [\"1 Hi\", \"2 Hello\", \"3 Hey\"] for lines = [\"Hi\", \"Hello\", \"Hey\"]";
      System.out.println("All test cases in main function passed");

    }
}

