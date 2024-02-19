
//package Java.Arrays;
import java.lang.Math;
import java.util.*;

public class Arrays_easy {
    public List<List<Integer>> threeSum(int[] arr) {
        // Sort the array
        Arrays.sort(arr);
        int n = arr.length;

        var ans = new ArrayList<List<Integer>>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                return;
            }

            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    var temp = new ArrayList<Integer>(Arrays.asList(arr[i], arr[j], arr[k]));
                    ans.add(temp);
                    j++;
                    k--;
                    // skip the duplicate:
                    while (j < k && arr[j] == arr[j - 1])
                        j++;
                    while (j < k && arr[k] == arr[k - 1])
                        k--;
                }
            }

        }

    }

    public static int trap(int[] arr) {
        int n = arr.length;
        int waterTrapped = 0;

        for (int i = 0; i < n; i++) {
            int j = i;
            int leftMax = 0, rightMax = 0;
            // biggest number in the left side
            while (j < 0) {
                leftMax = Math.max(leftMax, arr[j]);
                j--;
            }
            j = i;
            // biggest number in the right side
            while (j < n) {
                rightMax = Math.max(rightMax, arr[j]);
                j++;
            }

            waterTrapped += Math.min(leftMax, rightMax) - arr[i];
        }

        return waterTrapped;
    }

    public static void main(String args[]) {

        System.out.println("a");

    }
}