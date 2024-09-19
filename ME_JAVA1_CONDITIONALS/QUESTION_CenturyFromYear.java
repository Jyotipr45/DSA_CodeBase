import java.util.*;

public class Solution {

  public static int findCenturyFromYear(int a) {
    int result = a / 100;
    if(a % 100 != 0){
       result++;
    }
    return result;
  }

  public static void main(String args[]) {
        assert (findCenturyFromYear(1705) == 18) : "Expect 18 for a = 1705";
        System.out.println("All test cases in main function passed");

    }
}

