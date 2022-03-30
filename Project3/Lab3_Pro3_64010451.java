import java.util.Scanner;

public class Lab3_Pro3_64010451 {

    static Scanner input = new Scanner(System.in);
    static int[][] matrix;

    public static void main(String[] args) {
        System.out.print("Enter the size for the matrix:");
        int num = input.nextInt();
        matrix = new int[num][num];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        checkRow();
        checkCol();
        checkSuper();
        diagonal();
        subdiagonal();
    }

    public static void checkRow() {
        boolean noSameNumber = true;
        for (int row = 0; row < matrix.length; row++) {
            for (int i = 0; i < 2; i++) {
                if (checkMatrix(i, row, 0, 0, 1, matrix.length)) {
                    System.out.println("All " + i + "s on row " + row);
                    noSameNumber = false;
                }
            }
        }
        if (noSameNumber) {
            System.out.println("No same numbers on a row");
        }
    }

    public static void checkCol() {
        boolean noSameNumber = true;
        for (int col = 0; col < matrix.length; col++) {
            for (int i = 0; i < 2; i++) {
                if (checkMatrix(i, 0, col, 1, 0, matrix.length)) {
                    System.out.println("All " + i + "s on column " + col);
                    noSameNumber = false;
                }
            }
        }
        if (noSameNumber) {
            System.out.println("No same numbers on a column");
        }
    }

    public static void checkSuper() {
        boolean noSameNumber = true;
        for (int i = 0; i < 2; i++) {
            if (checkMatrix(i, 0, 1, 1, 1, matrix.length - 1)) {
                System.out.println("All " + i + "s on the superdiagonal");
                noSameNumber = false;
            }
        }
        if (noSameNumber) {
            System.out.println("No same numbers on the superdiagonal");
        }
    }

    public static void diagonal() {
        boolean noSameNumber = true;
        for (int i = 0; i < 2; i++) {
            if (checkMatrix(i, 0, 0, 1, 1, matrix.length)) {
                System.out.println("All " + i + "s on the diagonal");
                noSameNumber = false;
            }
        }
        if (noSameNumber) {
            System.out.println("No same numbers on the diagonal");
        }
    }

    public static void subdiagonal() {
        boolean noSameNumber = true;
        for (int i = 0; i < 2; i++) {
            if (checkMatrix(i, 1, 0, 1, 1, matrix.length - 1)) {
                System.out.println("All " + i + "s on the subdiagonal");
                noSameNumber = false;
            }
        }
        if (noSameNumber) {
            System.out.println("No same numbers on the subdiagonal");
        }
    }

    public static boolean checkMatrix(int check, int row, int col, int stepRow, int stepCol, int length) {
        for (int i = 0; i < length; i++) {
            if (matrix[row + stepRow * i][col + stepCol * i] != check) {
                return false;
            }
        }
        return true;
    }
}
