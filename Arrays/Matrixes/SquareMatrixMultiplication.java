public class Kata {

  public static int[][] matrixMultiplication(int[][] a, int[][] b) {

    int n = a.length;
    int[][] result = new int[n][];

    for (int i = 0; i<n; ++i) {
      
      result[i] = new int[n];
      
      for (int j = 0; j<n; ++j) {
        for (int c = 0; c<n; ++c)
          result[i][j] += a[i][c] * b[c][j];
      }
    }
    
    return result;
  }
}
