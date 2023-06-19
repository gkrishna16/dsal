public class recurBubbleSort {

    public static void RecurBubbleSort(int[] nums, int n) {
        if (n > 1) {
            for (var i = 0; i < n - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
            RecurBubbleSort(nums, n - 1);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 5, 4, 3, 11, 2, 1, 10, 1 };
        RecurBubbleSort(nums, nums.length);

        for (var i : nums) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}