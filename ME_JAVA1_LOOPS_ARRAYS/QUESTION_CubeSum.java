import java.util.*;

public class Solution {

    public static int cubeSum(int[] arr) {
      int cubeSum = 0;

      for(int num : arr)
          if(num % 2 == 0)
              cubeSum += Math.pow(num ,3);

      return cubeSum;    
    }

    public static void main(String args[]) {

      assert cubeSum(new int[] { 1, 2, 3, 4 }) == 72 : "Expect 72 for {1,2,3,4}";
      System.out.println("All test cases in main function passed");

    }
}

