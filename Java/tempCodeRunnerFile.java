public class Pyramid {
    public static void Pattern1(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }

    }

    public static void Pattern5(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            int sec = n - i + 1;
            while (j <= sec) {
                System.out.print("*");
                j++;
            }

            i++;
            System.out.println();
        }
    }

    public static void Pattern8(int n) {
        var i = 1;

        while (i <= 2 * n) {

            var space = 0;
            while (space <= i) {
                System.out.print(" ");
                space++;
            }
            var j = 0;
            var sec = 2 * n - 2 * i;
            while (j <= sec) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Pattern8(4);

    }
}