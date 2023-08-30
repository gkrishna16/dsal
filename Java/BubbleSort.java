
public class BubbleSort {
    public static void bubbleSort(int[] nums) {
        int i, j, temp;
        boolean swapped;

        for (i = 0; i < nums.length - 1; i++) {
            swapped = false;
            for (j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap nums[j] and nums[j+1]
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }

    public static void RecurBubbleSort(int nums[], int n) {
        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                var temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
                swapped = true;
            }
        }

        if (swapped == false) {
            return;
        }
        RecurBubbleSort(nums, n - 1);
    }

    public static void main(String[] args) {
        int[] nums = { 5, 4, 3, 2, 1 };
        RecurBubbleSort(nums, nums.length);
        for (var i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}