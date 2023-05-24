import java.util.*;

public class LongestSubstr {

    public static int longestSubs(int[] nums) {
        int longest = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i : nums) {
            hs.add(i);
        }
        for (int num : nums) {
            if (!hs.contains(num - 1)) {
                int length = 0;
                while (hs.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        System.out.println("Print");
        int val = longestSubs(new int[] { 1, 1, 2, 3, 4, 8, 9 });
        System.out.println(val);
    }
}


