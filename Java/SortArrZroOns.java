public class SortArrZroOns {
    public static void SrtZrsOns(int[] nums) {
        int l = 0;
        int m = 0;
        int h = nums.length - 1;
        int temp;

        while (m <= h) {
            switch (nums[m]) {
                case 0: {
                    temp = nums[m];
                    nums[m] = nums[l];
                    nums[l] = temp;
                    l++;
                    m++;
                    break;
                }
                case 1: {
                    m++;
                    break;
                }
                case 2: {
                    temp = nums[h];
                    nums[h] = nums[m];
                    nums[m] = temp;
                    h--;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        SrtZrsOns(nums);
        for (var i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
