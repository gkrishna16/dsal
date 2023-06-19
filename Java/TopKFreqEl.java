import java.util.*;

public class TopKFreqEl {

    public static void topKFreq(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<ArrayList<Integer>> ls = new ArrayList<>();
        for (var i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        hm.forEach((key, value) -> System.out.println(key + " -> " + value));
    }

    public static void main(String[] main) {
        topKFreq(new int[] { 5, 3, 3, 2, 1 });
    }

}
