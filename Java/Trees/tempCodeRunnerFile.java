// Java program to check if the binary tree is subtree of another tree 
// another binary tree

// A binary tree node

import java.util.*;

public class Main {

    public int[] TwoSum(int[] nums, int target) {

        Map<Integer, Integer> hs = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (hs.containsKey(nums[i])) {
                return new int[] { nums[i], i };
            }
            hs.put(nums[i], i);

        }

        return new int[] { -1 };

    }

    public static void main(String[] args) {
        Main mn = new Main();

        int nums[] = { 4, 2, 6, 10 };
        int ans[] = mn.TwoSum(null, 0);

        System.out.println(Arrays.toString(ans));
    }
}