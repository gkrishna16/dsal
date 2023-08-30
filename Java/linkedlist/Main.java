import other.A;

public class Main {

    public static void PrintPattern(int n) {
        int i = 1;
        while (i <= n) {
            int j = i;
            while (j >= 1) {
                System.out.print(j + " ");
                j--;
            }
            System.out.println();
            i++;
        }
    }

    public static void Pyramid(int n) {
        int i = 1;
        while (i <= n) {

            int space = 1;
            int spaceprt = n - i;

            while (space <= spaceprt) {
                System.out.print(" ");
                space++;
            }

            int star = 1;
            int strp = 2 * i - 1;
            while (star <= strp) {
                System.out.print("*");
                star++;
            }
            System.out.println();
            i++;
        }

        int j = 1;
        while (j <= n) {
            int space = 1;
            while (space <= j - 1) {
                System.out.print(" ");
                space++;
            }

            int star = 1;
            int starTot = 2 * n - 2 * j + 1;
            while (star <= starTot) {
                System.out.print("*");
                star++;
            }

            j++;
            System.out.println();
        }
    }

    public static void Pattern10(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        int j = 1;
        while (j <= n - 1) {
            int star = 1;
            int str = n - j;

            while (star <= str) {
                System.out.print("*");
                star++;
            }
            System.out.println();
            j++;
        }
    }

    public static void Pattern11(int n) {
        int start = 1;
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                start = 0;
            } else {
                start = 1;
            }

            int j = 1;
            while (j <= i) {
                System.out.print(start + " ");
                start = 1 - start;
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        // PrintPattern(5);
        // Pyramid(5);
        Pattern11(5);
    }

}
