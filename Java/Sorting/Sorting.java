class Sorting {
    // I will write code mainly in java.
    public static void merge(int nums[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        // populate the first array
        for (var i = 0; i < n1; i++) {
            leftArray[i] = nums[left + i];
        }
        // populate the second array
        for (var j = 0; j < n2; j++) {
            rightArray[j] = nums[mid + 1 + j];
        }

        int leftArrIndex = 0;
        int rightArrIndex = 0;
        int mergedArrIndex = left;

        while (leftArrIndex < n1 && rightArrIndex < n2) {
            if (leftArray[leftArrIndex] < rightArray[rightArrIndex]) {
                nums[mergedArrIndex] = leftArray[leftArrIndex];
                leftArrIndex++;
            } else {
                nums[mergedArrIndex] = rightArray[rightArrIndex];
                rightArrIndex++;
            }
            mergedArrIndex++;
        }

        while (leftArrIndex < n1) {
            nums[mergedArrIndex] = leftArray[leftArrIndex];
            leftArrIndex++;
            mergedArrIndex++;
        }
        while (rightArrIndex < n2) {
            nums[mergedArrIndex] = rightArray[rightArrIndex];
            rightArrIndex++;
            mergedArrIndex++;
        }

    }

    public static void mergeSort(int nums[], int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(nums, start, mid);
            mergeSort(nums, mid + 1, end);

            merge(nums, start, mid, end);
        }
    }

    public static void quickSort(int nums[], int low, int high) {
        if (low < high) {
            // pi is partitioning index, nums[p]
            // is now at right place

            var pi = partition(nums, low, high);
            // Seperately sort elements before
            quickSort(nums, low, pi - 1);
            quickSort(nums, pi + 1, high);

        }
    }

    public static int partition(int[] arr, int low, int high) {
        // choosing the pivot
        int pivot = arr[high];

        // Index of the smaller element and indicates.
        var i = (low - 1);
        for (int j = low; j <= high - 1; j++) { // The index is high - 1 because the last index is pivot
            // if current element is smaller than pivot.
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }

        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int nums[] = { 5, 4, 3, 2, 1 };
        int mid = 0 + ((nums.length - 1) - 0) / 2;

        quickSort(nums, 0, nums.length - 1);
        for (var i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
