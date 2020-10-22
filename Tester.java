import java.util.Arrays;

public class Tester {
  public static void main(String[] args) {
    int[] test = {1,2,3,4};
    int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    System.out.println("Sum: " + ArrayOps.sum(test));
    System.out.println("Largest Value: " + ArrayOps.largest(test));
    System.out.println("Sum of rows: " + Arrays.toString(ArrayOps.sumRows(matrix)));
    System.out.println("Sum of everything: " + ArrayOps.sum(matrix));
  }
}
