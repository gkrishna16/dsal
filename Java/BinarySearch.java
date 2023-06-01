public class BinarySearch {


    public static int bnrySrch(int[] nums, int numberToFind)
    {
     
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int middlePosition = (low + high) / 2;
            int middleNumber = nums[middlePosition];
            if (numberToFind == middleNumber) {
                return middlePosition;
            }
            if (numberToFind < middlePosition) {
                high = middlePosition - 1;
            }
            else {
                low = middlePosition + 1;   
            } 
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int val =bnrySrch(nums, 4);
        System.out.println(val);
    }
}

