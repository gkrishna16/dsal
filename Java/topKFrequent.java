import java.util.ArrayList;
import java.util.HashMap;

public class topKFrequent {

    public static void topKF(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<ArrayList<Integer>> Al = new ArrayList<>();

        for ( int i = 0;i< nums.length;i++){
            Al.add(new ArrayList<>());
        }

        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

     
    } 

    public static void main(String[] args) {
        
    }
    
}
