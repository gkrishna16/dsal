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

    public static void subArraySum(int a[], int sum) {
        int currSum = 0, start = 0, end = -1;

        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            currSum += a[i];
            if (currSum - sum == 0) {
                start = 0;
                end = i;
            }
            if (map.containsKey(currSum - sum)) {
                start = map.get(currSum - sum) + 1;
                end = i;
                break;
            }
            map.put(currSum, i);
        }
        if (end == -1) {
            System.out.println("Not found");
        } else {
            System.out.println(start + " " + end);
        }

    }

    public static int findAllSubarraysWithGivenSum(int arr[], int k) {
        var mp = new HashMap<Integer, Integer>();
        mp.put(0, 1);
        int cnt = 0, preSum = 0;

        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            int rsum = preSum - k;
            cnt += mp.getOrDefault(rsum, 0);
            mp.put(preSum, mp.getOrDefault(preSum, 0) + 1);
        }

        return cnt;
    }

    public static void rotate2(int[][] matrix) {

        // transpose the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse each row in the array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }

    public static ArrayList<Integer> printSpiral(int[][] mat) {
        // Define ans list to store the result
        int n = mat.length; // no of rows
        int m = mat[0].length; // no of columns

        // Define the list to store the results
        var ans = new ArrayList<Integer>();

        // Initialize the pointers required for traversal
        int top = 0, left = 0, bottom = n - 1, right = m - 1;
        while (top <= bottom && left <= right) {

            // for moving left to right
            for (int i = left; i <= right; i++) {
                ans.add(mat[top][i]);
            }
            top++;

            // For moving top to bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(mat[i][right]);
            }
            right--;

            // For moving right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i++) {
                    ans.add(mat[bottom][i]);
                }
                bottom--;
            }
            // For moving bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(mat[i][left]);
                }

                left++;
            }

        }

        return ans;

    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotate2(arr);
        System.out.println("Rotated Image");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int nums[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }

        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}

// the newer sdks are here on the verge of collapse twenty hour week
// three weeks in change
// bring them along