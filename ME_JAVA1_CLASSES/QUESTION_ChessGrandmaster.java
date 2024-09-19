import java.util.*;

public class Solution {

    static String chessGrandmaster(String[] x) {
      int countWins = 0;
      for(String str : x){
        if(str.equals("Win")){
          countWins++;
        } 
      }
     
      if(countWins >= 5) return "Grand Master"; 
      else if(countWins > 0) return "International Master";
      else return "Master";
    }

    public static void main(String args[]) {
        assert chessGrandmaster(new String[] { "Loss", "Loss", "Loss" }).equals("Master") : "Expect \"Master\" for no wins";
        assert chessGrandmaster(new String[] { "Win", "Win", "Win" }).equals("International Master") : "Expect \"International Master\" for 3 wins";
        assert chessGrandmaster(new String[] { "Win", "Win", "Win", "Win", "Win" }).equals("Grand Master") : "Expect \"Grand Master\" for 5 wins";
      System.out.println("All test cases in main function passed");

    }
}

