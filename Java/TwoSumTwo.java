public class TwoSumTwo {

    public static int[] TwoSum2(int [] nums, int target)
    {
        int left_pointer =  0, right_pointer = nums.length-1;
        while (left_pointer < right_pointer) {
            int currSum = nums[left_pointer] + nums[right_pointer];

            if (currSum > target) {
                right_pointer--;
            } else if (currSum < target) {
                left_pointer++;
            } else {
                return new int[] { left_pointer + 1, right_pointer + 1 };
            }

        }
        return new int[] {};
    }


    public static void main (String[] args)
    {
        int[] val = TwoSum2(new int[] { 2, 3, 4, 54 }, 7);
        for (int i : val) {
            System.out.println(i);
        }
        System.out.println("The main function.");
    }
}
