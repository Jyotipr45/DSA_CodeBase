import java.util.*;

public class Solution {

    static String hidePhoneNumber(String s) {
        // case : 1
        // --------
        // int hideLength = s.length() - 3;
        // String maskedPart = "*".repeat(hideLength);
        // String visiblePart = s.substring(hideLength);

        // return maskedPart + visiblePart;   

       StringBuilder sb = new StringBuilder();

       for(int i = 0; i < s.length() - 3; i++)
        sb.append("*");
       
       sb.append(s.substring(s.length() - 3));
       return sb.toString();

    }

    public static void main(String args[]) {
        assert (hidePhoneNumber("9090213229").equals("*******229")) : "Expect \"*******229\" when s= \"9090213229\"";
        System.out.println("All test cases in main function passed");

    }
}

