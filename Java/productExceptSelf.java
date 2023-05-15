public class productExceptSelf {

    public static int[] prodcutESelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int postfix = 1;
        for (int j = nums.length - 1; j >= 0; j--) {
            result[j] *= postfix;
            postfix *= nums[j];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] vals = prodcutESelf(nums);
        for (int i : vals) {
        System.out.println(i);
       }
    }
}


