import java.util.*;

public class quickSort {

    public static int partition(List<Integer> nums, int low, int high) {
        int pivot = nums.get(low);
        int i = low;
        int j = high;

        while (i < j) {
            while (nums.get(i) <= pivot && i <= high - 1) {
                i++;
            }
            while (nums.get(j) <= pivot && j >= low + 1) {
                j--;
            }

            if (i < j) {
                int temp = nums.get(i);
                nums.set(i, nums.get(j));
                nums.set(j, temp);
            }
        }
        int temp = nums.get(low);
        nums.set(i, nums.get(j));
        nums.set(j, temp);
        return j;
    }


    public static void quickSort(List<Integer> nums, int low , int high) {
        
    }


    public static void main(String args[]) {
    } 
}
