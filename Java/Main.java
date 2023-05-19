import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void BubbleSort(int[] nums) {
        if (nums.length < 0)
            return;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        //     int[] nums = { 5, 4, 3, 2, 1 };
        //     BubbleSort(nums);
        //     for (int i : nums) {
        //         System.out.print(i + " - ");
        //     }
        //     System.out.println();
        // }

        // int[] nums = { 1, 2, 3, 4, 5 };
        // for (int i : nums)
        // {
        //     System.out.println(i);
        // }

        Map<String, Integer> mp = new HashMap<String, Integer>();
        mp.put("name", 100);
        mp.put("age",200);

        for (Map.Entry<String, Integer> me : mp.entrySet()) {
        System.out.println(me.getKey() + " : " + me.getValue());
       };
    }
}





