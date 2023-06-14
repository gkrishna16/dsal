import java.util.*;

public class quickSort {
    public static int partition(int arr[], int left, int right, int pivot) {
        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public static void QuickSort(int[] nums, int left, int right) {
        if (left < right) {
            int pivot = nums[(left + right) / 2];
            int index = partition(nums, left, right, pivot);
            QuickSort(nums, left, index - 1);
            QuickSort(nums, index, right);
        }
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void main(String args[]) {

        int nums[] = { 5, 4, 3, 2, 1 };
        QuickSort(nums, 0, 4);

        for (var i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
