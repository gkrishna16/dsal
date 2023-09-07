import java.util.*;

public class Array_easy {

    public static ArrayList<Integer> FindUnion(int arr[], int arr2[], int n, int m) {
        var freq = new HashMap<Integer, Integer>();
        var Union = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        for (var j = 0; j < m; j++) {
            freq.put(arr2[j], freq.getOrDefault(arr2[j], 0) + 1);
        }

        for (int it : freq.keySet()) {
            Union.add((it));
        }

        return Union;
    }

    public static ArrayList<Integer> FindUnion2(int arr1[], int arr2[], int n, int m) {
        var s = new HashSet<Integer>();
        var Union = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            s.add(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            s.add(arr2[i]);
        }
        for (int it : s) {
            Union.add(it);
        }
        return Union;
    }

    public static void sortArray(ArrayList<Integer> arr, int n) {
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == 0)
                cnt0++;
            else if (arr.get(i) == 1) {
                cnt1++;
            } else {
                cnt2++;
            }
        }
        ;

        for (int i = 0; i < cnt0; i++) {
            arr.set(i, 0); // replacing 0s

        }

        for (int i = cnt0; i < cnt0 + cnt1; i++) {
            arr.set(i, 1); // replacing 1s
        }

        for (int i = cnt0 + cnt1; i < n; i++) {
            arr.set(i, 2); // replacing 2s
        }

    }

    public static void sortArray2(ArrayList<Integer> arr, int n) {
        int mid = 0, low = 0, high = n - 1;
        while (mid <= high) {
            if (arr.get(mid) == 0) {
                // swapping arr[low] and arr[mid]
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);
                low++;
                mid++;
            } else if (arr.get(mid) == 1) {
                mid++;
            } else {
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);
                high--;
            }
        }

    }

    public static int maxProfit(int[] arr) {
        int maxPrice = 0;
        int minPrice = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            maxPrice = Math.max(maxPrice, arr[i] - minPrice);
        }
        return maxPrice;
    }

    public static ArrayList<Integer> LeaderPrint(int[] nums, int n) {
        var ans = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            boolean leader = true;
            // Checking whether arr[i] is greater than all the elements in its right side.
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[i]) {
                    // If any element found is greater than current leader
                    // curr element is not the leader
                    leader = false;
                    break;
                }
            }
            // Push all the leaders in an array
            if (leader) {
                ans.add(nums[i]);
            }

        }
        return ans;
    };

    public static ArrayList<Integer> LeaderPrint2(int nums[], int n) {
        var ans = new ArrayList<Integer>();
        int max = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > max) {
                ans.add(nums[i]);
                max = nums[i];
            }
        }

        return ans;
    }

    public static void markRow(ArrayList<ArrayList<Integer>> matrix, int n, int m, int i) {

        // set all non-zero elements as -1 in the row i;
        for (int j = 0; j < m; j++) {
            // mark all the elements who are not 0 as -1
            if (matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
            }
        }

    }

    public static void markCols(ArrayList<ArrayList<Integer>> matrix, int n, int m, int j) {
        // mark the elements which are not 0 in the rows as -1
        for (int i = 0; i < n; i++) {
            if (matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
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

    public static void markCol(ArrayList<ArrayList<Integer>> matrix, int n, int m, int j) {
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

    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix.size(); // rows
        int m = matrix.get(0).size(); // cols

        ArrayList<ArrayList<Integer>> ans = setMatrix(matrix, n, m);

        System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();

        }
    }
}