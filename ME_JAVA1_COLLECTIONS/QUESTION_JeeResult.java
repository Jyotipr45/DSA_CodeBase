import java.util.*;

public class Solution {

    static String jeeResult(String marks) {
      String[] marksArray = marks.split(" ");

        List<Integer> marksList = new ArrayList<>();
        for (String mark : marksArray) {
            // Convert each mark to an integer and add it to the list
            marksList.add(Integer.parseInt(mark));
        }

        // Find the highest and lowest marks using Collections.max() and Collections.min()
        int highestMark = Collections.max(marksList);
        int lowestMark = Collections.min(marksList);

        // Return the result in the specified format
        return highestMark + " " + lowestMark;
    }

    public static void main(String args[]) {

      assert (jeeResult("4 2 -13 4 5").equals("5 -13")) :  "Expect \"5 -13\" for s=\"4 2 -13 4 5\"" ;
      System.out.println("All test cases in main function passed");

    }
}

