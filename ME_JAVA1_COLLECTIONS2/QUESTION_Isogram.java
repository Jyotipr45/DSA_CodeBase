import java.util.*;

public class Solution {

    public static boolean isogram(String s) {
      Set<Character> set = new HashSet<>();

      for(char ch : s.toCharArray()){
        
        if(set.contains(ch))return false;
        set.add(ch);
      }

      return true;

    }

    public static void main(String args[]) {

      assert (isogram("aba") == false) : "Expect false for s = \"aba\"" ;
      System.out.println("All test cases in main function passed");

    }
}

