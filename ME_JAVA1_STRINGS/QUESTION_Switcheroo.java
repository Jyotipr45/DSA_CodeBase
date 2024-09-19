import java.util.*;

public class Solution {

    static String switcheroo(String s) {
        // create a placeHolder to avoid losing track of order
        char placeHolder = 'x';
        // createa result string variable to relace 'a' to placeHolder
        String result = s.replace('a', placeHolder);
        // after that replace 'b' with 'a'
        result = result.replace('b', 'a');
        // lastly replace placeHolder with 'b'
        result = result.replace(placeHolder, 'b'); 

        // return the final String
        return result;
    }

    public static void main(String args[]) {
        String s = "aabacbaa";
        assert (switcheroo(s).equals("bbabcabb")) : "Expect \"bbabcabb\" for s = \"aabacbaa\"";
        System.out.println("All test cases in main function passed");

    }
}

