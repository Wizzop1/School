public class Kata {
  public static int[][] matrixAddition(int[][] a, int[][] b) {
    int l = a.length;
    int[][] result = new int[l][l];
    for(int i=0; i<l; i++){
      for(int j=0; j<l; j++){
        result[i][j] = a[i][j] + b[i][j];
      }
    }
    return result;
  }
}
