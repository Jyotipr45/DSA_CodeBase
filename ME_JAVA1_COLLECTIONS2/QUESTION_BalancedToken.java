import java.util.*;

public class Solution {

  static boolean balancedToken(String name) {

    if (name == null || name.isEmpty()) return true;
    // Convert the name string to lowercase to treat uppercase and lowercase letters as the same
    name = name.toLowerCase();
    
    // Create a HashMap to store character frequencies
    Map<Character, Integer> charFrequency = new HashMap<>();
    
    // Count the frequency of each character in the name string
    for (int i = 0; i < name.length(); i++) {
        char ch = name.charAt(i);
        charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
    }
    
    // Get the frequency of the first character
    int frequency = charFrequency.get(name.charAt(0));
    
    // Check if all characters have the same frequency
    for (int count : charFrequency.values()) {
        if (count != frequency) {
            return false;
        }
    }
    
    return true;
  }

  public static void main(String args[]) {
    assert balancedToken("Dererd") == true : "Expect true for input =\"Dererd\"";
    System.out.println("All test cases in main function passed");
  }
}

