import java.util.Arrays;

public class MatrixSeparator {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[][] matrix = { { 2, 9, 12 },
                { 15, 16, 24 },
                { 5, 5, 7 } };

        int m = matrix.length;
        int n = matrix[0].length;

        int[] odd = new int[m * n];
        int[] even = new int[m * n];
        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int num = matrix[i][j];
                if (num % 2 == 0) {
                    even[evenIndex] = num;
                    evenIndex++;
                } else {
                    odd[oddIndex] = num;
                    oddIndex++;
                }
            }
        }

        // Sort odd array
        Arrays.sort(odd, 0, oddIndex);

        // Sort even array
        Arrays.sort(even, 0, evenIndex);

        // Print sorted arrays
        System.out.print("Odd[] = ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();

        System.out.print("Even[] = ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();
    }
}