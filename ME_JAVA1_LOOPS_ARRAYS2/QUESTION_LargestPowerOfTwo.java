import java.util.*;

public class Solution {

    static int findLargestPowerOfTwo(int n) {
         if(n == 0) return n;
         int num = 0;
         while(Math.pow(2, num) <= n) num++;
         return num - 1;
    }

    public static void main(String args[]) {

        assert findLargestPowerOfTwo(9) == 3 : "Expect 3 for n = 9";

        assert findLargestPowerOfTwo(32) == 5 : "Expect 5 for n = 32";
        System.out.println("All test cases in main function passed");

    }
}

