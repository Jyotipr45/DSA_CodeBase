public class Solution {
    public static String braveAndMice(String animal) {
       return (animal.equalsIgnoreCase("Mouse")) ? "Hide" : "Walk"; 
       

    }

    public static void main(String[] args) {
        String animal = "Dog";
        assert braveAndMice(animal).equals("Walk") : "Expect \"Walk\" for animal=\"Dog\"";
        animal = "Mouse";
        assert braveAndMice(animal).equals("Hide") : "Expect \"Hide\" for animal=\"Mouse\"";
        System.out.println("All test cases in main function passed");
    }
}
