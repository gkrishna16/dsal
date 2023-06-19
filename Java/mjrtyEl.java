public class mjrtyEl {

    public static int mjrtyElem(int[] nums) {
        int count = 0;
        int majEl = 0;
        for (int num : nums) {
            if (count == 0) {
                majEl = num;
            }
            if (majEl == num) {
                count++;
            } else {
                count--;
            }
        }
        return majEl;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 3, 2, 2, 2 };
        System.out.println(mjrtyElem(nums));

    }

}
