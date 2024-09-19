public class Solution {
    public static String evenOrOdd(int number) {
        return ((number & 1) == 0)? "Even" : "Odd";
    }

    public static void main(String[] args){
        int number = 10;
        assert(evenOrOdd(number).equals("Even")) : "Expect Even for input 10";
        System.out.println("All test cases in main function passed");
    }
}
