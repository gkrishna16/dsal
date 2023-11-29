public class Main {
    public static void Pyramid1(int n) {
        int i = 1;
        while (i <= n) {
            // print space
            int sp = 1;
            int sptill = n - i;
            while (sp <= sptill) {
                System.out.print(" ");
                sp++;
            }

            // print stars
            int str = 1;
            int strtill = 2 * i - 1;
            while (str <= strtill) {
                System.out.print("*");
                str++;
            }
            ;

            System.out.println();
            i++;
        }

    };

    public static void Pyramid2(int n) {
        int i = 0;
        while (i < n) {
            // print space
            int sp = 0;
            while (sp < i) {
                System.out.print(" ");
                sp++;
            }
            // print star
            int str = 1;
            int strtill = (n * 2) - (2 * i) - 1;

            while (str <= strtill) {
                System.out.print("*");
                str++;
            }

            System.out.println();
            i++;
        }
    }

    public static void Pattern10(int n) {
        int i = 1;
        int rowtill = (2 * n) - 1;
        while (i <= rowtill) {
            // print star
            int str = 1;
            int strtill = i;
            if (i > n) {
                strtill = 2 * n - i;
            }
            while (str <= strtill) {
                System.out.print("*");
                str++;
            }
            System.out.println();
            i++;
        }
    }

    public static void ReverseTriangle(int n) {
        // print reverse triangle

    }

    public static void Pattern22(int n) {

        System.out.println();

        for (int i = 0; i < 2 * n - 2; i++) {
            for (int j = 0; j < 2 * n - 2; j++) {
                int top = i; // distance from the top
                int left = j; // distance from the left side
                int bottom = (2 * n - 2) - i; // distance from the bottom
                int right = (2 * n - 2) - j; // distance from the right side
                // Pattern 2 in the Pattern2

                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        Pattern22(4);
        // ReverseTriangle(5);
        // Pyramid1(5);
        // Pyramid2(5);
    }
}