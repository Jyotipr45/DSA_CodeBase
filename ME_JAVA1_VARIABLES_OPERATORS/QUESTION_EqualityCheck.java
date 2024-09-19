import java.util.*;

public class Solution {

    public static boolean isEqual(int a, int b) {
        return (a == b)? true : false;
    }

    public static void main(String args[]) {
        assert (isEqual(100, 100) == true) : "Expect true for a = 100, b = 100";
        System.out.println("All test cases in main function passed");
    }
}

