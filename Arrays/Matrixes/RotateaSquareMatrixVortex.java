public class Kata
{
  public static int[][] rotateLikeAVortex(int[][] matrix)
  {
    int[][] m = matrix.clone();
    int n = m.length;
    int x = -1;
    while (x++ < n/2) {
      for (int i=x; i<n-x; i++) {
        int[] r = m[i].clone();
        for (int j=x; j<n-x; j++) r[j] = matrix[j][n-1-i];
        m[i] = r;
      }
      matrix = m.clone();
    }
    return m;
  }
}
