class Sorting {

    // Merge Sort
    public static void merge(int[] arr, int l, int m, int h) {
        int n1 = m - l + 1;
        int n2 = h - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[i + l];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }

        int a = 0;
        int b = 0;

        int k = l;
        while (a < n1 && b < n2) {
            if (L[a] < R[b]) {
                arr[k] = L[a];
                a++;

            } else {
                arr[k] = R[b];
                b++;

            }
            k++;
        }

        while (a < n1) {
            arr[k] = L[a];
            a++;
            k++;
        }

        while (b < n2) {
            arr[k] = R[b];
            b++;
            k++;
        }

    }

    public static void mergeSort(int arr[], int l, int h) {
        if (l < h) {
            int m = l + (h - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, h);
            merge(arr, l, m, h);
        }
    }

    public static void quickSort(int arr[], int l, int h) {

        if (l < h) {
            int pi = partition(arr, l, h);

            quickSort(arr, l, pi - 1);
            quickSort(arr, pi + 1, h);
        }

    }

    public static int partition(int arr[], int l, int h) {
        int i = (l - 1);
        int pivot = arr[h];
        for (int j = l; j < h; j++) {
            if (pivot > arr[j]) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, h);
        return (i + 1);
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 3, 2, 1 };
        quickSort(arr, 0, arr.length - 1);
        // mergeSort(arr, 0, arr.length - 1);
        for (var i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}