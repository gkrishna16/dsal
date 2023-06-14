import java.util.*;

public class mergeSort {

    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {

            int leftLength = arr.length / 2;
            int rightLength = arr.length - leftLength;

            int[] leftArr = new int[leftLength];
            int[] rightArr = new int[rightLength];

            // put the values to the array
            for (int i = 0; i < leftLength; i++) {
                leftArr[i] = arr[i];
            }
            for (int j = 0; j < rightLength; j++) {
                rightArr[j] = arr[leftLength + j];
            }
            System.out.println(Arrays.toString(leftArr) + " " + Arrays.toString(rightArr));
            // System.out.println(mid);
            // System.out.println(leftLength + " " + rightLength);

            mergeSort(leftArr);
            mergeSort(rightArr);
            System.out.println("Merging now.");

            merge(arr, leftArr, rightArr);
            System.out.println(Arrays.toString(arr) + "  -------  Array for the time being.");
        }
    }

    public static void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int i = 0, j = 0, k = 0;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < leftArr.length) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightArr.length) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String args[]) {

        int arr[] = { 5, 4, 3, 2, 1, 9, 10 };
        mergeSort(arr);

        for (var i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println(" ");
    }

}
