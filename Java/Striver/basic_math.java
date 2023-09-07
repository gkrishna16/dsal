public class basic_math {

    public static void reverse(int n) {
        int num = n;
        int reverse = 0;

        while (num != 0) {
            int lst = num % 10;
            reverse = reverse * 10 + lst;
            num = num / 10;
        }

        System.out.println(reverse);
    }

    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }

    public static boolean Armstrong(int n) {
        int originalNo = n;
        int count = 0;
        int temp = n;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int sumOfPower = 0;
        int tempNum = n;
        while (tempNum != 0) {
            int lastdigit = tempNum % 10;
            sumOfPower += Math.pow(lastdigit, count);
            tempNum /= 10;
        }

        return originalNo == sumOfPower;
    }

    public static void PrintDivisors(int num) {
        for (var i = 1; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(i);
                if (i != num / i) {
                    System.out.println(num / i);
                }
            }
        }
    }

    public static void IsPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Not prime.");
                return;
            }
        }
        System.out.println("Prime number.");

    }


    public static void main(String args[]) {

        // reverse(502);
        // boolean armstrng = Armstrong(153);
        // System.out.println(armstrng);
        // PrintDivisors(8);
        IsPrime(19);
    }
}