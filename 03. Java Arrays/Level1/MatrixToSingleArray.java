import java.util.Scanner;

public class MatrixToSingleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Rows: ");
        int rowCount = scanner.nextInt();
        System.out.println("Enter Columns: ");
        int columnCount = scanner.nextInt();
        
        if (rowCount <= 0 || columnCount <= 0) {
            System.out.println("Invalid dimensions entered.");
            System.exit(0);
        }
        
        int[][] matrix = new int[rowCount][columnCount];
        System.out.println("Enter Elements");
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < columnCount; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
        
        System.out.println("Original Matrix:");
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < columnCount; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        
        int singleArraySize = rowCount * columnCount;
        int[] singleArray = new int[singleArraySize];
        int arrayIndex = 0;
        
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < columnCount; col++) {
                singleArray[arrayIndex++] = matrix[row][col];
            }
        }
        
        System.out.println("Converted 1D Array: ");
        for (int index = 0; index < singleArraySize; index++) {
            System.out.print(singleArray[index] + " ");
        }
        
        scanner.close();
    }
}