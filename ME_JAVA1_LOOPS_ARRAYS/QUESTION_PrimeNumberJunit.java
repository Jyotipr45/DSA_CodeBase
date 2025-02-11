import java.util.*;
// import static org.junit.Assert.assertEquals;

public class Solution {

    public static boolean checkPrime(int n) {
        if(n <= 1) return false;

        for(int i = 2; i * i <= n; i++)
           if(n % i == 0) return false;

        return true;   
    }

    public static void main(String args[]) {
        int n = 3;
        assert checkPrime(n) == true : "Expect true for n = 3";
        System.out.println("All test cases in main function passed");
    }
}

