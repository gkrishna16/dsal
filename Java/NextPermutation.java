import java.util.*;

public class NextPermutation {

    public static List<Integer> nextGreaterPermutation(List<Integer> A) {
        int ind = -1;
        for (int i = A.size() - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                // index i is the break point
                ind = i;
                break;
            }
        }
        // if break point does not exist
        if (ind == -1) {
            // reverse the whole array
            Collections.reverse(A);
            return A;

        }

        // Step 3 : reverse the right half
        List<Integer> sublist = A.subList(ind + 1, A.size());
        Collections.reverse(sublist);
        return A;

    }

    public static void makePermute(int[] nums) {
    }

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(new Integer[] { 2, 1, 5, 4, 3, 0, 0 });
        List<Integer> ans = nextGreaterPermutation(A);

        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");

    }
}
