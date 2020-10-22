public class ArrayOps {

  public static int sum(int[] arr) {
    int s = 0;
    for (int i = 0; i < arr.length; i++) {
      s += arr[i];
    }
    return s;
  }

  public static int largest(int[] arr) {
    int largest= 0;
    for (int i = 0; i < arr.length; i++) {
      if (i == 0 || arr[i] > largest) {largest = arr[i];}
    }
    return largest;
  }

  public static int[] sumRows(int[][] matrix) {
    int[] sums = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      sums[i] = sum(matrix[i]);
    }
    return sums;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[] largests = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      largests[i] = largest(matrix[i]);
    }
    return largests;
  }

  public static int sum(int[][] matrix) {
    return sum(sumRows(matrix));
  }

  public static int[] sumCols(int[][] matrix) {
    int[] sums = new int[matrix[0].length];
    for (int i = 0; i < matrix[0].length; i++) {
      int s = 0;
      for (int j = 0; j < matrix.length; j++) {
        s += matrix[j][i];
      }
      sums[i] = s;
    }
    return sums;
  }

  public static boolean isRowMagic(int[][] matrix) {
    return sum(matrix[0]) * matrix.length == sum(matrix);
  }

  public static boolean isColMagic(int[][] matrix) {
    return sumCols(matrix)[0] * matrix.length == sum(matrix);
  }
}
