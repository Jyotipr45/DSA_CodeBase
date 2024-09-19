import java.util.*;

public class Solution {

    static String findLanguage(String country) {
      Map<String, String> map = Map.of("Australia", "English",
                                       "England", "English",
                                        "Brazil", "Portuguese",
                                        "China", "Chinese", 
                                        "France", "French",
                                        "Spain", "Spanish",
                                        "Germany", "German",
                                        "Japan", "Japanese",
                                        "Greece", "Greek",
                                        "India", "Hindi");

      return map.get(country);                                  

    }

    public static void main(String args[]) {

      assert findLanguage("Australia").equals("English") : "Expect \"English\" for country = \"Australia\"";
      System.out.println("All test cases in main function passed");

    }
}

