//package Java.Arrays;

public class Arrays_easy {

    static int findLargestElement(int nums[]) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        System.out.println(max);
        return max;
    }

    static private int secondSmallest(int[] arr, int n) {
        if (n < 2) {
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] < small) {
                second_small = small;
                small = arr[i];
            } else if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
        }

        System.out.println("smallest " + small);
        return second_small;
    }

    static boolean isSorted(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }

        return true                                                     ;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 0 }, n = 6;

        System.out.println(isSorted(arr, n));
    }
}