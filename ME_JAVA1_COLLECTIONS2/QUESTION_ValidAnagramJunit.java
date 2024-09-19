import java.util.*;

public class Solution {

    static boolean isValidAnagram(String s, String t) {
        // If lengths are not the same, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Use a hash map to count the frequency of each character in the first string
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Decrement the frequency while iterating the second string
        for (char ch : t.toCharArray()) {
            if (!charCountMap.containsKey(ch)) {
                return false;
            }
            charCountMap.put(ch, charCountMap.get(ch) - 1);
            if (charCountMap.get(ch) == 0) {
                charCountMap.remove(ch);
            }
        }

        // If map is empty, they are anagrams
        return charCountMap.isEmpty();
    }

    public static void main(String args[]) {

        String a1 = "anagram";
        String a2 = "nagaram";
        assert (isValidAnagram(a1, a2) == true) : "Expect true for Strings : anagram & nagaram";

        String b1 = "rat";
        String b2 = "car";
        assert (isValidAnagram(b1, b2) == false): "Expect false for Strings : rat & car";
        System.out.println("All test cases in main function passed");

    }
}

