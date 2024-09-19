import java.util.*;

public class Solution {

    static String indexCapitalisation(String s, int[] ind) {
        StringBuilder result = new StringBuilder(s);

        for (int idx : ind) {
            // Check if the index is within the bounds of the string
            if (idx >= 0 && idx < s.length()) {
                char capitalizedChar = Character.toUpperCase(s.charAt(idx));
                result.setCharAt(idx, capitalizedChar);
            }
        }
 
        return result.toString();
    }

    public static void main(String args[]) {
        String s = "learn by doing";
        int[] ind = new int[] { 0, 6, 9 };
        assert (indexCapitalisation(s, ind).equals("Learn By Doing")) : "Expect \"Learn By Doing\" for s = \"learn by doing\" and ind = [0, 6, 9]";

        System.out.println("All test cases in main function passed");

    }
}

