package Pramod.Java;

public class pattern6 {
    public static void main(String[] args) {
        pattern6(5);

    }

    static void pattern6(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalcolsInrow = row > n ? 2 * n - row : row;
            int noOFspaces = n - totalcolsInrow;
            for (int s = 0; s < noOFspaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalcolsInrow; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
