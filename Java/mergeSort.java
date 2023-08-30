import java.util.Arrays;

public class mergeSort {

    public static void InsertionSort(int[] nums) {

        if (nums.length > 1) {

            int[] leftHalf = new int[nums.length / 2];
            int[] rightHalf = new int[nums.length - nums.length / 2];

            for (var i = 0; i < nums.length / 2; i++) {
                leftHalf[i] = nums[i];
            }

            for (var j = 0; j < nums.length - nums.length / 2; j++) {
                rightHalf[j] = nums[nums.length / 2 + j];
            }

            System.out.println(Arrays.toString(leftHalf));
            System.out.println(Arrays.toString(rightHalf));

            InsertionSort(leftHalf);
            InsertionSort(rightHalf);

            int i = 0, j = 0, k = 0;
            while (i < leftHalf.length && j < rightHalf.length) {
                if (leftHalf[i] <= rightHalf[j]) {
                    nums[k] = leftHalf[i];
                    i++;
                } else {
                    nums[k] = rightHalf[j];
                    j++;
                }
                k++;
            }

            while (i < leftHalf.length) {
                nums[k] = leftHalf[i];
                i++;
                k++;
            }
            while (j < rightHalf.length) {
                nums[k] = rightHalf[j];
                j++;
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 5, 4, 3, 2, 1 };
        InsertionSort(nums);

        System.out.println(Arrays.toString(nums));
    }
}