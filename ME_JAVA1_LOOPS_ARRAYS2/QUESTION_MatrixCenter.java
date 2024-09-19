import java.util.*;

public class Solution {

    public static Integer matrixCenter(int[][] m) {
        int numRows = m.length;
        // if matrix is empty return null
        if(numRows == 0) return null;

        int numCols = m[0].length;
         // Check if both row and column lengths are odd
        if(numRows % 2 == 0 || numCols % 2 == 0) return null;
        // calculate center indices
        int centerRow = numRows / 2;
        int centerCol = numCols / 2;

        return (m[centerRow][centerCol]);
    }

    public static void main(String args[]) {
        
        assert (matrixCenter(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }) == 5) : "Expect 5 from { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }";
        System.out.println("All test cases in main function passed");

    }
}

