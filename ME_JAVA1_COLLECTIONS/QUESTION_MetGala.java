import java.util.*;
// import static org.junit.Assert.assertEquals;

public class Solution {
    List<String> list;
    public Solution(List list) {
      this.list = list;
    }
    public int celebrityIndex(String celeb) {
      // Check if the list contains the celebrity
        if (list.contains(celeb)) {
            // Return the index (position) of the celebrity in the list
            return list.indexOf(celeb) + 1;
        } else {
            // Return -1 if the celebrity is not in the list
            return -1;
        }
    }

    public static void main(String args[]) {
      List<String> list = Arrays.asList("Kendall Jenner", "Cardi B", "Blake Lively", "Gigi Hadid",
          "Simone Ashley", "Rihanna Fenty");
        Solution obj = new Solution(list);
        String celeb1 = "Blake Lively";
        assert obj.celebrityIndex(celeb1) == 3 : "Expect 3 for celeb = Blake Lively";
        String celeb2 = "Taylor Swift";
        assert obj.celebrityIndex(celeb2) == -1 : "Expect -1 for celeb = Taylor Swift";
        System.out.println("All test cases in main function passed");
    }
}

