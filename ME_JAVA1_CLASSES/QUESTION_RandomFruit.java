import java.util.*;

public class Solution {
    private String fruit;

    // Array of fruit names
    private static final String[] FRUITS = {"apple", "banana", "orange"};
    // Constructor to initialize the Fruit attribute with a random fruit
    public Solution(){
        this.fruit = getRandomFruit();
    }

    // Member function to get the value of the Fruit attribute
    public String GetFruit() {
        return this.fruit;
    }

    // Helper method to get a random fruit from the array
    private String getRandomFruit(){
        Random random = new Random();
        int index = random.nextInt(FRUITS.length);
        return FRUITS[index];
    }

    public static void main(String args[]) {
        Solution obj1 = new Solution();
        System.out.println(obj1.GetFruit());
        Solution obj2 = new Solution();
        System.out.println(obj2.GetFruit());
    }
}

