import java.util.*;

public class Solution {

    public static String addSpaces(String words[]) {
        if(words == null) return null;
        if(words.length == 0) return "";
        // Use StringBuilder to concatenate words with spaces
        StringBuilder sentenceBuilder = new StringBuilder(words[0]);

        for (int i = 1; i < words.length; i++) {
            sentenceBuilder.append(" ").append(words[i]);
        }

        // Convert StringBuilder to String and return
        return sentenceBuilder.toString();
    }

    public static void main(String args[]) {
        String[] arr = { "Hello", "World" };
        assert addSpaces(arr).equals("Hello World") : "Expect \"Hello world\" for words = {Hello, World}";
        arr = new String[0];
        assert addSpaces(arr).equals("") : "Expect \"\" for input = [] or input = new String[0]";
        System.out.println("All test cases in main function passed");
    }
}

