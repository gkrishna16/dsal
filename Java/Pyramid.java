
public class Pyramid {

    static int num = 100;

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
        // upper part

    }

    public static void main(String[] args) {
      

    }
}