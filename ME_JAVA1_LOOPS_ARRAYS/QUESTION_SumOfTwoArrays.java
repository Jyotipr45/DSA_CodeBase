import java.util.*;

public class Solution {

    public static int sumOfTwoArrays(int[] arr1, int[] arr2) {
        // initialize sum with 0
        int sum = 0;
        // run a loop for adding the element of arr1
        for(int num1 : arr1) sum += num1;
        // run a loop for adding the element of arr2
        for(int num2 : arr2) sum += num2;
         // return the addition of both array
        return sum;
    }

    public static void main(String args[]) {
        assert (sumOfTwoArrays(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 }) == 21) : "Expect 21 for {1,2,3},{4,5,6}";
        System.out.println("All test cases in main function passed");

    }
}

