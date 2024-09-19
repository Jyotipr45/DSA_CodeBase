import java.util.*;

public class Solution {

    public static String combineStrings(String s1, String s2) {
        int i = 0;
        int j = 0;


        Set<Character> uniqueChar = new HashSet<>();

        while(i < s1.length() && j < s2.length()){
            uniqueChar.add(s1.charAt(i++));
            uniqueChar.add(s2.charAt(j++));
        }

        while(i < s1.length())uniqueChar.add(s1.charAt(i++));;

        while(j < s2.length())uniqueChar.add(s2.charAt(j++));;

        List<Character> list = new ArrayList<>(uniqueChar);

        // Sort the list
        Collections.sort(list);

        // Build the result string
        StringBuilder result = new StringBuilder();
        for (char ch : list) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String args[]) {

        assert combineStrings("aaab", "bjjj").equals("abj") : "Expect \"abj\" for (\"aaab\",\"bjjj\")";
        System.out.println("All test cases in main function passed");

    }
}

