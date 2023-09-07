public class sorting_I {

    public static void merge(int nums[]) {
        if (nums.length < 2)
            return;
        int left = nums.length / 2;
        int right = nums.length - nums.length / 2;

        int L[] = new int[left];
        int R[] = new int[right];

        for (int i = 0; i < left; i++) {
            L[i] = nums[i];
        }
        for (var j = 0; j < right; j++) {
            R[j] = nums[left + j];
        }

        merge(L);
        merge(R);
        sort(nums, L, R);

    }

    public static void sort(int nums[], int left[], int right[]) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                nums[k] = left[i];
                i++;
            } else {
                nums[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            nums[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            nums[k] = right[j];
            j++;
            k++;
        }
    }

    public static void quickSort(int[] nums) {

    }

    public static void recurBubbleSort(int[] nums, int n) {
        // Base case: range == 1
        if (n == 1)
            return;

        int didSwap = 0;
        for (int i = 0; i <= n - 2; i++) {
            if (nums[i] > nums[i + 1]) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
                didSwap = 1;
            }

        }
        if (didSwap == 0) {
            return;
        }

        recurBubbleSort(nums, n - 1);

    }

    public static void InsertionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int j = i;
            while (j > 0 && nums[j - 1] > nums[j]) {
                int temp = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
        System.out.println("After using insertion sort: ");
        for (var i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void recurInsertionSort(int nums[], int i, int n) {
        if (i == n) {
            return;
        }
        int j = i;
        while (j > 0 && nums[j - 1] > nums[j]) {
            int temp = nums[j];
            nums[j] = nums[j - 1];
            nums[j - 1] = temp;
            j--;
        }
        recurInsertionSort(nums, i + 1, n);
    }

    public static void findLargest(int nums[]) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println(max);
    }

    public static boolean CheckSorted(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        int[] nums = { 1, 23, 4, 5, 4 };
      

  
        System.out.println();
    }

}
