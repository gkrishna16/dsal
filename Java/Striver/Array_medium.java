import java.util.*;

public class Array_medium {

    public static void sortArrayof0s(int nums[]) {
        int mid = 0, low = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;

            }
        }
    }

    public static void markRows(ArrayList<ArrayList<Integer>> matrix, int n, int m, int i) {
        for (int j = 0; j < m; j++) {
            if (matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
            }
        }
    }

    public static void markCols(ArrayList<ArrayList<Integer>> matrix, int n, int m, int j) {
        // mark all the elements which are not 0 in the row as -1
        for (int i = 0; i < n; i++) {
            if (matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> setMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    markRows(matrix, n, m, i);
                    markCols(matrix, n, m, j);
                }
            }
        }

        // finally mark all -1 as zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == -1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }

    static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int col0 = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    // mark i-th row:
                    matrix.get(i).set(0, 0);

                    // mark j-th column
                    if (j != 0) {
                        matrix.get(0).set(j, 0);
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        // mark 0 from (1,1) to (n-1, m-1)
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix.get(i).get(j) != 0) {
                    if (matrix.get(0).get(j) == 0 || matrix.get(i).get(0) == 0) {
                        matrix.get(i).set(j, 0);
                    }
                }
            }
        }

        // finally mark the first row and first column
        if (matrix.get(0).get(0) == 0) {
            for (int i = 0; i < m; i++) {
                matrix.get(0).set(i, 0);
            }
            ;
            if (col0 == 0) {
                for (int i = 0; i < n; i++) {
                    matrix.get(i).set(0, 0);
                }
            }
        }

        return matrix;

    }

    static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int rotated[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - i - 1] = matrix[i][j];
            }
        }
        return rotated;
    }

    public static int[][] transposeMatrix(int nums[][]) {
        int transposed[][] = new int[nums.length][nums[0].length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                transposed[i][j] = nums[j][i];
            }
        }
        return transposed;
    }

    public static int[][] trasnposeMatrix(int nums[][]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                int temp = nums[i][j];
                nums[j][i] = nums[i][j];
                nums[i][j] = temp;
            }

        }
        return nums;
    }

    public static int majorityEl2(int nums[]) {
        var mpp = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }

        // searching for the majority element :
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (nums.length / 2)) {
                return it.getKey();
            }
        }

        return -1;
    }

    public static int maxSubArray(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int sum = 0;

                // add all the element of subarray:
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                maxi = Math.max(maxi, sum);
            }
        }

        return maxi;

    };

    public static int maxSubArr2(int arr[], int n) {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                maxi = Math.max(maxi, sum);
            }
        }

        return maxi;
    }

    public static long maxSubArrSum(int arr[], int n) {
        long maxi = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return maxi;
    }

    public static int maxProfit(int nums[]) {
        int maxPro = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    maxPro = Math.max(nums[j] - nums[i], maxPro);
                }
            }
        }

        return maxPro;
    }

    public static int maxProfit2(int nums[]) {
        int maxProfit = 0;
        int minPrice = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            minPrice = Math.min(minPrice, nums[i]);
            maxProfit = Math.max(maxProfit, nums[i] - minPrice);
        }

        return maxProfit;

    }

    public static void nextPermutation(int nums[]) {
        if (nums == null || nums.length <= 1)
            return;

        int ind = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i + 1] > nums[i]) {
                ind = i;
                break;
            }
        }

        // if break point does not exist:
        if (ind == -1) {
            // reverse the whole array
            reverse(nums, 0, nums.length - 1);
        }

    }

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void reverse(int[] A, int i, int j) {
        while (i < j) {
            swap(A, i++, j--);
        }
    }

    public static int longestSuccessiveElements(int[] a) {
        if (a.length == 0)
            return 0;

        int longest = 1;
        var set = new HashSet<Integer>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        // find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }

        }
        return longest;
    }

    public static int findAllSubarraysWithGivenSum(int arr[], int k) {
        var st = new HashMap<Integer, Integer>();
        st.put(0, 1);
        int cnt = 0, preSum = 0;
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            int diff = preSum - k;
            cnt += st.getOrDefault(diff, 0);
            // Update the count of prefix sum
            // in the map
            st.put(preSum, st.getOrDefault(preSum, 0) + 1);
        }
        return cnt;

    }

    public static void main(String args[]) {
        int[] arr = { 3, 1, 2, 4 };
        int k = 6;
        int cnt = findAllSubarraysWithGivenSum(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
    }
}
