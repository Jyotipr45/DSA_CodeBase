import java.util.*;

public class Solution {
    public static int findDiagonalLRSum(int[][] arr, int n){
       int i = 0, sum = 0;
       while(i < n){
           sum += arr[i][i];
           i++;
       }
       return sum;
    }

    public static int findDiagonalRLSum(int[][] arr, int n){
       int i = 0,col = n - 1, sum = 0;
       while(i < n){
           sum += arr[i][col];
           i++; col--;
       }
       return sum;
    }

    public static int findRowSum(int[][] arr, int n, int row){
       int j = 0, sum = 0;
       while(j < n){
           sum += arr[row][j];
           j++;
       }
       return sum;
    }

    public static int findColSum(int[][] arr, int n, int col){
       int j = 0, sum = 0;
       while(j < n){
           sum += arr[j][col];
           j++;
       }
       return sum;
    }

    static boolean isMagicSquare(int[][] arr) {
        int row = arr.length;
        
        int sum = findDiagonalLRSum(arr, row);
        for(int idx = 0; idx < row; idx++){
            if(sum != findRowSum(arr, row, idx)) return false;
            if(sum != findColSum(arr, row, idx)) return false;   
        }
        if(sum != findDiagonalRLSum(arr, row)) return false;

        return true;
    }

    public static void main(String args[]) {

        int[][] arr1 = {{4,9,2}, {3,5,7}, {8,1,6}};
        assert isMagicSquare(arr1) == true : "Expect true for arr = {{4,9,2}, {3,5,7}, {8,1,6}}";

        int[][] arr2 = {{4,9,2}, {3,5,9}, {8,1,6}};
        assert isMagicSquare(arr2) == false : "Expect false for arr = {{4,9,2}, {3,5,9}, {8,1,6}}";
        System.out.println("All test cases in main function passed");

    }
}

