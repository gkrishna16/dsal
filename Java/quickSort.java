import java.util.*;

public class quickSort {

    public static int partition(int nums[]) {

        return left;
    }

    public static void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = nums[(left + right) / 2];
        int index = partition(nums, left, right, pivot);
        quickSort(nums, left, index - 1);
        quickSort(nums, index, right);

    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void main(String args[]) {

        int nums[] = { 5, 4, 3, 2, 1 };
        quickSort(nums, 0, 4);

        for (var i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}
