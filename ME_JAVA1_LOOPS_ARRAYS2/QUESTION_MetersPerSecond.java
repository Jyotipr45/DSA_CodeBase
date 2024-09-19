import java.util.*;

public class Solution {

    public static double metersPerSecond(int x) {
      // 1km = 1000m and 1h = 3600s 
      return (x * 1000.0) / 3600.0;
    }

    public static void main(String args[]) {

      assert (metersPerSecond(36) == 10) : "Expect 10 for 36";
      System.out.println("All test cases in main function passed");

    }
}

