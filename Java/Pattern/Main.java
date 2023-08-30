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

    public static void main(String args[]) {
        Pyramid1(5);
        Pyramid2(5);
    }
}