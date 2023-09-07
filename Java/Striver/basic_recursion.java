import java.util.*;

public class basic_recursion {
    static int count = 1;

    public static void Printfunct() {
        if (count == 10)
            return;
        System.out.println(count);
        count++;
        Printfunct();

    }

    public static void PrintNameNTimes(int i, int N) {
        if (i > N)
            return;

        System.out.println("Gopal");
        PrintNameNTimes(i + 1, N);
    }

    public static void OneToN(int i, int n) {
        if (i < 1)
            return;

        OneToN(i - 1, n);
        System.out.println(i);
    }

    public static void NtoOne(int N, int i) {
        if (N < 1)
            return;

        System.out.println(N);
        NtoOne(N - 1, i);
    }

    public static int SumToN(int n) {
        if (n < 1)
            return 0;

        return n + SumToN(n - 1);
    }

    static void func(int i, int sum) {
        // Base condition
        if (i < 1) {
            System.out.println(sum);
            return;
        }

        // Function call to increment sum by i till 1 increments to 1
        func(i - 1, sum + i);
    }

    static int sumTo(int n) {
        // Base case
        if (n == 0) {
            return 0;
        }
        // Problem broken down into 2 parts and then combined.
        return n + sumTo(n - 1);
    }

    public static int Factorial(int n) {
        // Base condition.
        if (n == 0) {
            return 1;
        }

        // Problem broken down into 2 parts and then combined
        return n * Factorial(n - 1);
    }

    public static int Fib(int n) {
        if (n <= 1) {
            return n;
        }
        // Problem broken down into 2 functional calls
        // and their results combined and returned
        int last = Fib(n - 1);
        int slast = Fib(n - 2);

        return last + slast;
    }

    public static void reverseArray(int arr[], int n) {
        int[] ans = new int[n];
        for (var i = n - 1; i >= 0; i--) {
            ans[n - i - 1] = arr[i];
        }
        for (var j = 0; j < ans.length; j++) {
            System.out.print(ans[j] + " ");
        }
        System.out.println();
    }

    static void reverseArray(int arr[], int start, int end) {
        if (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            reverseArray(arr, start + 1, end - 1);
        }
    }

    public static boolean isPalindrome(String strng) {
        int left = 0, right = strng.length() - 1;
        while (left < right) {
            char l = strng.charAt(left), r = strng.charAt(right);
            if (!Character.isLetterOrDigit(l)) {
                left++;
            } else if (Character.isLetterOrDigit(r)) {
                right--;
            } else if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static boolean recurIsPalindrome(int i, String strng) {
        if (i >= strng.length() / 2) {
            return true;
        }

        // If start is not equal to end, not palindrome
        if (strng.charAt(i) != strng.charAt(strng.length() - i - 1)) {
            return false;
        }

        // If both characters are same, increment i and check start+1 and end - 1
        return recurIsPalindrome(i + 1, strng);
    }

    // Count frequency of each element in the array
    public static void countFrequency(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (mp.containsKey(nums[i])) {
                mp.put(nums[i], mp.get(nums[i]) + 1);
            } else {
                mp.put(nums[i], 1);
            }
        }

        // Traverse through map and print frequencies
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static void HighestFreq(int nums[], int n) {
        boolean visited[] = new boolean[n];
        int maxFreq = 0, minFreq = n;
        int maxEl = 0, minEl = 0;

        for (int i = 0; i < n; i++) {
            // skip this element if already processed
            if (visited[i] == true) {
                continue;
            }
            // Count frequency
            int count = 1;
            for (var j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count > maxFreq) {
                maxEl = nums[i];
                maxFreq = count;
            }
            if (count < minFreq) {
                minEl = nums[i];
                minFreq = count;
            }
        }
        System.out.println("The highest frequency element is: " + maxEl);
        System.out.println("The lowest frequency element is: " + minEl);
    }



    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 3, 3, 5, 5 };
        // countFrequency(nums);
        HighestFreq(nums, nums.length);

    }
}
