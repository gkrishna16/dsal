import java.util.*;

public class Array_Hard {
    public static long nCr(int r, int c) {
        long res = 1;

        // calculating nCr
        for (int i = 0; i < c; i++) {
            res = res * (r - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static int pascalTriangle(int r, int c) {
        int element = (int) nCr(r - 1, c - 1);
        return element;
    }

    // Print the row of the triangle
    public static void pascalTriangle1(int n) {
        // printing the entire row n :
        for (int c = 1; c <= n; c++) {
            System.out.print(nCr(n - 1, c - 1) + " ");
        }
        System.out.println();
    }

    public static void printRow(int n) {
        long ans = 1;
        System.out.print(ans + " ");

        for (int i = 1; i < n; i++) {
            ans = ans * (n - i);
            ans = ans / i;
            System.out.print(ans + " ");
        }

        System.out.println();
    }

    public static void printPascalTriangle(int n) {
        // the number of rows will be equal to n

        for (int row = 0; row < n; row++) {
            var temp_lst = new ArrayList<Integer>();
            for (int col = 0; col < row; col++) {

            }
        }
    }

    public static void main(String args[]) {
        int r = 5;
        int c = 3;

        printRow(5);

        // int element = pascalTriangle(r, c);
        // System.out.println("These element at position (r,c) is: " + element);
        // pascalTriangle1(5);

    }

}
