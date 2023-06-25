import java.util.*;

public class RearrangeSign {
    public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> nums) {
        int N = nums.size();
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(N, 0));
        int posIndex = 0;
        int negIndex = 1;

        for (var i = 0; i < N; i++) {
            if (nums.get(i) < 0) {
                ans.set(negIndex, nums.get(i));
                negIndex += 2;

            } else {
                ans.set(posIndex, nums.get(i));
                posIndex += 2;
            }
        }
        return ans;
    }

    public static ArrayList<Integer> RearrOptimal(ArrayList<Integer> nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (var i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                pos.add(nums.get(i));

            } else {
                neg.add(nums.get(i));
            }
        }

        // If positives are leser than the negatives
        if (pos.size() < neg.size()) {
            // Fill the array alternatively till the point
            // where positives and negatives are equal in number
            for (var i = 0; i < pos.size(); i++) {
                nums.set(2 * i, pos.get(i));
                nums.set(2 * i + 1, neg.get(i));
            }

            // Fill the remaining negatives at the end of the array
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                nums.set(index, neg.get(i));
                index++;
            }
        } else {
            // fill the array till the size of negative elements
            for (var i = 0; i < neg.size(); i++) {
                nums.set(2 * i, pos.get(i));
                nums.set(2 * i + 1, neg.get(i));
            }

            // put the remaining numbers in the end of the array
            int index = neg.size() * 2;
            for (var i = neg.size(); i < pos.size(); i++) {
                nums.set(index, pos.get(i));
                index++;
            }

        }
        return nums;
    }

    public static void main(String[] args) {
        // Array Initialization.
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, -5));
        ArrayList<Integer> ans = RearrOptimal(A);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}