public class maxSbArr {

    public static int maxSubArr(int[] nums, int n) {
        int maxi = Integer.MIN_VALUE; // maximum value
        for (var i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += nums[j];
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }

    public static long mxSbArr(int[] nums) {
        long maxi = Long.MIN_VALUE;
        long sum = 0;
        for (int i : nums) {
            sum += i;
            if (sum > maxi) {
                maxi = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        long val = mxSbArr(nums);
        System.out.println(val);

        for (var i : nums) {
            System.out.println(i);
        };
    }

}
