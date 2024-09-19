import java.util.*;

public class Solution {

    public static double KhalFunction(int x) {
        return (x * 2.0) / 9.0 ;
    }


    public static void main(String args[]) {
        assert KhalFunction(9) == 2 : "Expect 2 for 9";
        System.out.println("All test cases in main function passed");
    }
}

