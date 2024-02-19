import java.awt.List;
import java.util.*;
import java.util.HashMap;

public class Singleton {
    // public static int[] topKFrequent(int[] nums, int k) {

    // List[] bucket = new List[nums.length + 1];
    // var map = new HashMap<Integer, Integer>();

    // // add elements in the hashtable
    // for (int num : nums) {
    // map.put(num, map.getOrDefault(num, 0) + 1);
    // }

    // for (int key : map.KeySet()) {
    // int frequency = map.get(key);
    // if (bucket[frequency] == null) {
    // bucket[frequency] = new ArrayList<>();
    // }
    // bucket[frequency].add(key);
    // }

    // int[] res = new int[k];
    // int counter = 0;

    // for (int pos = bucket.length - 1; pos >= 0 && counter < k; pos--) {
    // for (Integer num : bucket[pos]) {
    // res[counter++] = num;
    // }
    // }

    // return res;

    // }

    public static void main(String[] args) {

        var pQueue = new PriorityQueue<Integer>();

        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(30);

        // printing the top element
        System.out.println(pQueue.peek());

        // printing the top element and printing it
        System.out.println(pQueue.poll());

        // int arr[] = { 1, 1, 1, 2, 2, 3 };
        // int[] ans = topKFrequent(arr, 2);

        // for (int an : ans)
        // System.out.print(an);

        // System.out.println(Arrays.toString(ans));

    }

}
