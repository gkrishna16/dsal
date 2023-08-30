public class insertionSort {

    public static void InsertionSort(int[] arr) {
        for (var i = 0; i < arr.length; i++) {
            var temp = arr[i];
            var j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) 
        System.out.println("The same element.");{

        int[] nums = { 5, 4, 3, 2, 1 };
        InsertionSort(nums);

        for (int i : nums) {
            System.out.print(i + " ");
        }

        System.out.println();

    }

}
