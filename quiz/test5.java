import java.util.Scanner;

public class test5 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input size of matrix : ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];

        System.out.println("Random matrix is :");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
        System.out.print("Please input value of Row and Column : ");

        int select_row = input.nextInt();
        int select_column = input.nextInt();
        System.out.println("The selected member is " + matrix[select_row][select_column]);

        System.out.print("(i) Members on Top : ");
        if (select_row != 0) {
            for (int i = select_row - 1; i >= 0; i--) {
                System.out.print(matrix[i][select_column] + " ");
            }
            System.out.println("");
        } else {
            System.out.println("No");
        }

        System.out.print("(ii) Members on the Right Hand Side : ");
        if (select_column != size - 1) {
            for (int i = select_column + 1; i <= size - 1; i++) {
                System.out.print(matrix[select_row][i] + " ");
            }
            System.out.println("");
        } else {
            System.out.println("No");
        }

        System.out.print("(iii) Member at the Bottom : ");
        if (select_row != size - 1) {
            for (int i = select_row + 1; i <= size - 1; i++) {
                System.out.print(matrix[i][select_column] + " ");
            }
            System.out.println("");
        } else {
            System.out.println("No");
        }

        System.out.print("(iv) Member on the Left Hand Side : ");
        if (select_column != 0) {
            for (int i = select_column - 1; i >= 0; i--) {
                System.out.print(matrix[select_row][i] + " ");
            }
        }

    }
}
