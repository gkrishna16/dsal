import java.util.*;

public class Array_medium {
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

    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int rotated[][] = transposeMatrix(arr);

        System.out.println("Rotated Image");
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated.length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }

        // ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        // matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        // matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        // matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        // int n = matrix.size(); // rows
        // int m = matrix.get(0).size(); // cols

        // ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m);

        // System.out.println("The Final matrix is: ");
        // for (ArrayList<Integer> row : ans) {
        // for (Integer ele : row) {
        // System.out.print(ele + " ");
        // }
        // System.out.println();

        // }
    }
}
