import java.util.*;

public class Solution {

    private final Map<String, String> map = new HashMap<>();
    public Solution() { // constructor
        // your code
     
    }

    public void addWord(String key, String value) {

        // your code
        map.put(key, value);
    }

    public String lookUp(String key) {
        // your code
        String dict = map.getOrDefault(key, "No entry found for " + key);
        return dict;
    }

    public static void main(String args[]) {

        Solution dict = new Solution();
        dict.addWord("Mango", "A yellow colored fruit");
        assert (dict.lookUp("Mango").equals("A yellow colored fruit")) : "Expect \"A yellow colored fruit\" when looking up \"Mango\"";
        assert (dict.lookUp("Kiwi").equals("No entry found for Kiwi")) : "Expect \"No entry found for Kiwi\" when looking up \"Kiwi\"";

        System.out.println("All test cases in main function passed");

    }
}

