import java.io.*;
import java.util.*;

class Sorting {

    public static void merge(int arr[], int l, int m, int h) {
        int n1 = m - l + 1;
        int n2 = h - m;

        // create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }

        // Merge temp arrays
        int i = 0, j = 0;

        // Initialize index of merged subrray array
        int k = l;

        // sort the arrays
        while (i < n1 && j < n2) {
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // sort first and second element
            sort(arr, l, m);
            sort(arr, m + 1, r);
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] prod = new int[n];

        left[0] = 1;
        right[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }

        // fill the right side of the array
        for (int j = n - 2; j > -1; j--) {
            right[j] = right[j + 1] * arr[j + 1];
        }

        // fill the prod array
        for (int i = 0; i < n; i++) {
            prod[i] = right[i] * left[i];
        }

        return prod;

    }

    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int[] nums = { 1, 2, 3, 4 };

        int[] ans = productExceptSelf(nums);

        System.out.println(Arrays.toString(ans));

    }
}