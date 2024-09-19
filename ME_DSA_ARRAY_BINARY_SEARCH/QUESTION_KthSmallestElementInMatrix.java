import java.util.*;


class KthSmallestElementInMatrix{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<ArrayList<Integer>>Matrix = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer>row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(sc.nextInt());
            }
            Matrix.add(row);
        }
        int ans = kthSmallestElementInMatrix(Matrix,k);
        System.out.print(ans);
    }

    static int findLessOrEqualInRow(ArrayList<Integer> row, int element) {
        int count = 0;
        for(int col = 0; col < row.size(); col++){
            if(row.get(col) > element){
                break;
            }
            count++;
        }
        return count;
    }

    static int countOfElementLessOrEqual(List<ArrayList<Integer>>matrix, int element){
        int n = matrix.size();
        int count = 0;
        for(int  row = 0; row < n; row++) {
            if(matrix.get(row).get(0) > element){
                break;
            }else if(matrix.get(row).get(n-1) <= element) {
                count += n;
            }else {
                count += findLessOrEqualInRow(matrix.get(row), element);
            }
        }
        return count;

    }

    static int kthSmallestElementInMatrix(List<ArrayList<Integer>>matrix, int k){
        int n = matrix.size();
        int start = matrix.get(0).get(0), end = matrix.get(n-1).get(n-1);
        
        int ans = end;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            int count = countOfElementLessOrEqual(matrix, mid);
            if(count == k){
                ans = mid;
                end = mid - 1;
            }else if(count < k){
                start = mid + 1;
            }else{
                ans = mid;
                end = mid - 1;
            }
        }

        return ans;
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