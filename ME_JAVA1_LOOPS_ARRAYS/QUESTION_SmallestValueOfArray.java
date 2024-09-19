import java.util.*;

public class Solution {

    static int smallestValueOfArray(int[] numbers, String toReturn) {
        int min = 0;
        for(int i = 1; i < numbers.length; i++){
           if(numbers[i] < numbers[min])  min = i;
        }
        return (toReturn == "index")? min : numbers[min];  
    }

    public static void main(String args[]) {
        assert (1 == smallestValueOfArray(new int[] { 4, 2, 3, 1, 5 }, "value")) : "Expect 1 for numbers = [4, 2, 3, 1, 5] and toReturn = \"index\"";
        assert (3 == smallestValueOfArray(new int[] { 4, 2, 3, 1, 5 }, "index")) : "Expect 3 for numbers = [4, 2, 3, 1, 5] and toReturn = \"index\"";
        System.out.println("All test cases in main function passed");

    }
}

