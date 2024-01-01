import java.util.*;

public class Hashing {
    public static void countDigits(int arr[], int n) {
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        for (int i : map.keySet())
            System.out.println("number: " + i + " is repeated " + map.get(i) + " times.");
    }

    public static void countFreq(int arr[], int n) {
        boolean visited[] = new boolean[n];
        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;
        for (int i = 0; i < n; i++) {
            // Skip this element if already possessed.
            if (visited[i] == true) {
                continue;
            }
            ;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (maxFreq < count) {
                maxEle = arr[i];
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = arr[i];
                minFreq = count;
            }
        }
        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 1, 1, 3, 6, 7, 6, 8, 7 };
        countFreq(arr, arr.length);

    }
}
