import java.util.*;

public class Solution {

    public static int arithmeticOperation(int a, int b, int c, int d) {
        return (a + b + c) - d;
    }

    public static void main(String args[]) {
        assert (arithmeticOperation(10, 11, 12, 3) == 30) : "Expect 30 for a = 10, b = 11, c = 12, d = 3";
        System.out.println("All test cases in main function passed");
    }
}

