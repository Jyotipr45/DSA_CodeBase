import java.util.*;

class Student {
    int id;
    String name;
    int marks[] = new int[5];

    public Student(int id, String name, int marks[]) {
        this.id = id;
        this.name = name;

        for (int i = 0; i < 5; i++) {
            this.marks[i] = marks[i];
        }
    }
}

class MarksSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student arr[] = new Student[n];

        for (int i = 0; i < n; i++) {

            int id = sc.nextInt();
            String name = sc.next();
            int marks[] = new int[5];

            for (int j = 0; j < 5; j++)
                marks[j] = sc.nextInt();
            arr[i] = new Student(id, name, marks);
        }

        int res[] = marksSort(n, arr);

        for (int j : res) {
            System.out.print(j + " ");
        }
    }

    static int[] marksSort(int n, Student arr[]) {

        Arrays.sort(arr, (a, b) -> {
            // add the marks of students and compare using comparator
            int sumA = a.marks[0] + a.marks[1] + a.marks[2] + a.marks[3] + a.marks[4];
            int sumB = b.marks[0] + b.marks[1] + b.marks[2] + b.marks[3] + b.marks[4];  
            // if sumA != sumB then, sort them in descending order
            if(sumA != sumB) return (sumB - sumA); 
            // if student names are not equals sort them in ascending order
            if(a.name.equals(b.name) == false) return (a.name.compareTo(b.name));
            // lastly sort the id in ascending order
            return (a.id - b.id); 
        });
        // take final array to store the resultant array with id in ascending order
        int[] result = new int[n];

        for(int i = 0; i < n; i++){
            result[i] = arr[i].id;
        }
        // return the result array
        return result;
    }
}

/* 
Crio Methodology

Milestone 1: Understand the problem clearly
1. Ask questions & clarify the problem statement clearly.
2. Take an example or two to confirm your understanding of the input/output

Milestone 2: Finalize approach & execution plan
1. Understand what type of problem you are solving and see if you can recollect solving similar problems in the past
      a. Obvious logic (this would only test ability to convert logic to code)
      b. Figuring out logic
      c. Knowledge of specific algorithm, data structure or pattern
      d. Knowledge of specific domain or concepts
      e. Mapping real world into abstract concepts/data structures
2. Brainstorm multiple ways to solve the problem and pick one based on the TC/SC requirements
3. Get to a point where you can explain your approach to a 10 year old

Milestone 3 : Come up with an Instruction Manual for a 10 year old
1. Take a stab at the high-level logic & write it down like a detailed Instruction Manual for a 10 Year old where each line of the manual can be expanded into a logical line(s) of code.
2. Try to offload logic out of the main section as much as possible by delegating to functions.

Milestone 4: Code by expanding your 10 Year Olds "Instruction Manual
1. Run your code snippets at every logical step to test correctness (Helps avoid debugging larger pieces of code later)
2. Make sure you name the variables, functions clearly.
3. Use libraries as much as possible

Milestone 5: Prove that your code works using custom test cases
1. Make sure you check boundary conditions and other test cases you noted in Milestone 1
      a. If compiler is not available, dry run your code on a whiteboard or paper
2. Suggest optimizations if applicable during interviews
*/