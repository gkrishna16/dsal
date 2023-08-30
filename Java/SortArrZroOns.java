public class SortArrZroOns {
    public static void SrtZrsOns(int[] nums) {

        int low = 0, mid = 0, high = nums.length - 1;
        int temp;
        while (mid <= high) {
            switch (nums[mid]) {
                case 0: {
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;

                }

            case 1: {
                    mid++;

                }
                case 2: {
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;

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
