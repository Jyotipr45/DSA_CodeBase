import java.util.*;
import java.util.ArrayList;

public class Solution {

    public static String[] combineAllStrings(String[] s1, String[] s2) {
        List<String> list = new ArrayList<>();

        for(String comb1 : s1){
           for(String comb2 : s2){
              list.add(comb1 + comb2);
           }
        }

        return list.toArray(new String[0]);
    }

    public static void main(String args[]) {

        String input1[] = {"a", "c", "e"};
        String input2[] = {"b", "d", "f"};
        String output[] = {"ab", "ad", "af", "cb", "cd", "cf", "eb", "ed", "ef"};
        assert Arrays.equals(combineAllStrings(input1, input2), output) : "Expect [\"ab\", \"ad\", \"af\", \"cb\", \"cd\", \"cf\", \"eb\", \"ed\", \"ef\"] for input1 = [\"a\", \"c\", \"e\"] and input2 = [\"b\", \"d\", \"f\"]";
        System.out.println("All test cases in main function passed");

    }
}

