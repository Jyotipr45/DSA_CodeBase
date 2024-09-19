import java.util.*;

public class Solution {

    static int getNthFibonacciNumber(int N) {
        if(N < 2) return 0;
        int first = 0, second = 1;
        
        while(N > 1){
           int next = first + second;
           first = second;
           second = next;
           N--;
        }
        return second;
    }

    public static void main(String args[]) {

        assert (getNthFibonacciNumber(3) == 2) : "Expect \"2\" for N = 3";
        assert (getNthFibonacciNumber(4) == 3) : "Expect \"3\" for N = 4";
        System.out.println("All test cases in main function passed");


    }
}

