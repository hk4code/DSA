

public class hollowrectangle {
    public static void main(String[] args) {
        int m = 10;
        int k = 8;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == k - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print a space here
                }
            }
            System.out.println();
        }
    }
}
