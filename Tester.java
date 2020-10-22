import java.util.Arrays;

public class Tester {
  public static void main(String[] args) {
    int[] test = {1,2,3,4};
    int[][] matrix = {{1,2,3},{1,2,3}}; //,{7,8,9},{10,11,12}};
    System.out.println("Sum: " + ArrayOps.sum(test));
    System.out.println("Largest Value: " + ArrayOps.largest(test));
    System.out.println("Sum of rows: " + Arrays.toString(ArrayOps.sumRows(matrix)));
    System.out.println("Largest in each row: " + Arrays.toString(ArrayOps.largestInRows(matrix)));
    System.out.println("Sum of everything: " + ArrayOps.sum(matrix));
    System.out.println("Sum of columns: " + Arrays.toString(ArrayOps.sumCols(matrix)));
    System.out.println("Rows equal: " + ArrayOps.isRowMagic(matrix));
    System.out.println("Columns equal: " + ArrayOps.isColMagic(matrix));
    System.out.println("Last row&col equal: " + ArrayOps.isLocationMagic(matrix,1,2));
  }
}
