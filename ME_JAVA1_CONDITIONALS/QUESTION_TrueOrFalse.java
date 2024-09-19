public class Solution {
    public static String trueOrFalse(boolean teaching) {
        return (teaching == true) ? "Good" : "Bad";
    }

    public static void main(String[] args) {
        boolean teaching =true;
        assert(trueOrFalse(teaching).equals("Good")) : "Expect \"Good\" for teaching = true";
        System.out.println("All test cases in main function passed");
    }
}
