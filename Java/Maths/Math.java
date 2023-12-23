import java.util.*;

public class Math {

    public static void rotate(int[] nums, int k) {
        int temp[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            temp[(i + k) % nums.length] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String args[]) {
        int nums[] = { 5, 4, 3, 2, 1, 0 };

        rotate(nums, 3);
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
