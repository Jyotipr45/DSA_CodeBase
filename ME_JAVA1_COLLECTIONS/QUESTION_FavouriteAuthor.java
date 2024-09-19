import java.util.*;
// import static org.junit.Assert.assertEquals;

public class Solution {

    public static String findNthFavourite(List<String> authorList, int n) {
        
            // Calculate the index from the end (most favorite end)
            int index = authorList.size() - n;
            
            // Return the nth favorite author
            return authorList.get(index);
        
    }

    public static void main(String args[]) {
        List<String> authorList = Arrays.asList("Chetan Bhagat", "Aravind Adiga", "Khushwant Singh",
            "Salman Rushdie", "Shyam Singha Roy");
        int n = 1;
               assert Objects.equals(findNthFavourite(authorList, 1), "Shyam Singha Roy") : "Expect Shyam Singha Roy for n = 1";

        System.out.println("All test cases in main function passed");
    }
}

