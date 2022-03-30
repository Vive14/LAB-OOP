import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input size of matrix: ");
        int n = in.nextInt();
        if (n > 3) {
            int[][] a = new int[n][n];
            System.out.println("Random matrix: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = (int) (Math.random() * 10);
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }

            System.out.print("Please input value of Row and column: ");
            int row = in.nextInt();
            int column = in.nextInt();
            System.out.println("The selected member is "+a[row][column]);

            // (a)
            System.out.print("(a) Members on Top: ");
            boolean flag = true;
            for (int i = row - 1; i >= 0; i--) {
                flag = false;
                System.out.print(a[i][column]);
                if (i != 0)
                    System.out.print(",");
            }
            if (flag)
                System.out.println("NO");
            else
                System.out.println();

            // (b)
            System.out.print("(b) Members on the Right Hand Side: ");
            flag = true;
            for (int j = column + 1; j < n; j++) {
                flag = false;
                System.out.print(a[row][j]);
                if (j != n - 1)
                    System.out.print(",");
            }
            if (flag)
                System.out.println("NO");
            else
                System.out.println();

            // (c)
            System.out.print("(c) Members at the Bottom: ");
            flag = true;
            for (int i = row + 1; i < n; i++) {
                flag = false;
                System.out.print(a[i][column]);
                if (i != n - 1)
                    System.out.print(",");
            }
            if (flag)
                System.out.println("NO");
            else
                System.out.println();

            // (d)
            System.out.print("(d) Members on the Left Hand Side: ");
            flag = true;
            for (int j = column - 1; j >= 0; j--) {
                flag = false;
                System.out.print(a[row][j]);
                if (j != 0)
                    System.out.print(",");
            }
            if (flag)
                System.out.println("NO");
            else
                System.out.println();
            System.out.println("End of program.");
        } else {
            System.out.println("Error::Cannot Make the matrix, Size can be 3 or more");
        }
        in.close();
    }
}
