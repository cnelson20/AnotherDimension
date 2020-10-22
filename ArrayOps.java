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
}
