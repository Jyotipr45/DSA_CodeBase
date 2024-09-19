import java.util.*;

public class Solution {

    static int modeFrequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<arr.length;i++){
           map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        int max = 0;

        for(int freq : map.values()){
            if(freq > max){
               max = freq;
            }
        }

        return max;
    }

    public static void main(String args[]) {
        int[] arr = { 3, 3, 3, 3, 1 };
        assert (modeFrequency(arr) == 4) : "Expect 4 for arr = { 3, 3, 3, 3, 1 }";
        System.out.println("All test cases in main function passed");
    }
}

