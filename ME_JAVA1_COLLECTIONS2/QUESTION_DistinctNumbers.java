import java.util.*;

public class Solution {

  static int[] distinctNumbers(int[] arr) {
    Set<Integer> set = new LinkedHashSet<>();
    for(int num : arr){
        set.add(num);
    }

    int[] distinctArr = new int[set.size()];
    int index = 0;
    for (int num : set) {
        distinctArr[index++] = num;
    }

    return distinctArr;
  }

  public static void main(String args[]) {
    assert Arrays.equals(new int[] { 3, 2, 1, 11 }, distinctNumbers(new int[] { 3, 2, 3, 3, 1, 11, 11, 1, 2, 3 })) : "Expect {3, 2, 1, 11} for arr={ 3, 2, 3, 3, 1, 11, 11, 1, 2, 3 }";
    System.out.println("All test cases in main function passed");
  }
}

