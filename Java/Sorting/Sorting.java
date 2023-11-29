public class Sorting {

    public static void recurinsertionSort(int nums[], int i, int n) {
        if (i == n)
            return;

        int j = i;
        while (j > 0 && nums[j - 1] > nums[j]) {
            int temp = nums[j];
            nums[j] = nums[j - 1];
            nums[j - 1] = temp;
            j--;
        }
        recurinsertionSort(nums, i + 1, n);
    }

    public static void insertionSort(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            int j = i;
            while (j > 0 && nums[j - 1] > nums[j]) {
                int temp = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = temp;
                j--;
            }
            ;
        }

    }

    public static void main(String[] args) {

        int nums[] = { 5, 4, 3, 2, 1 };
        // recurinsertionSort(nums, 0, nums.length);

        insertionSort(nums);
        for (var i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}