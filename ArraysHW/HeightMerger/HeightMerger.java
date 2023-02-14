import java.util.Arrays;

public class HeightMerger {
    public static void main(String[] args) {
        int[] A = { 34, 12, 56, 7, 25 };
        int[] B = { 112, 23, 4, 77, 89 };
        int[] C = mergeHeight(A, B);

        // Print the ordered height
        System.out.print("C = {");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i]);
            if (i < C.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static int[] mergeHeight(int[] A, int[] B) {
        // Merge A and B into a new array
        int[] C = new int[A.length + B.length];
        System.arraycopy(A, 0, C, 0, A.length);
        System.arraycopy(B, 0, C, A.length, B.length);

        // Sort the merged array in increasing order
        Arrays.sort(C);

        return C;
    }
}
