import java.util.*;

public class Solution {

    static String stonePaperScissor(String s1, String s2) {
       if(s1 == s2){
          return "Share it!";
       }else if(s1 == "Stone" && s2 == "Scissor"){
          return "Tom";
       }else if(s1 == "Scissor" && s2 == "Paper"){
          return "Tom";
       }else if(s1 == "Paper" && s2 == "Stone"){
          return "Tom";
       }else
          return "Jerry";
    }

    public static void main(String args[]) {
        assert (stonePaperScissor("Stone", "Paper").equals("Jerry")) : "Expect \"Jerry\" for input = \" Stone\", \" Paper\" ";
        assert (stonePaperScissor("Stone", "Stone").equals("Share it!")) : "Expect \"Share it!\" for input = \" Stone\", \" Stone\" ";
      System.out.println("All test cases in main function passed");
    }
}

