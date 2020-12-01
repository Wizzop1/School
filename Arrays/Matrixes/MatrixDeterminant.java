public class Matrix{
  public static int determinant(int[][] m){

    if(m.length == 1) return m[0][0];
    int d = 0, k, l;

    for(int j = 0; j < m.length; j++){
      int[][] n = new int[m.length-1][m.length-1];

      for(k = 0; k < m.length; k++) for(l = 0; l < m.length; l++)

        if(k != 0 && l != j) n[k-((k>0)?1:0)][l-((l>j)?1:0)] = m[k][l];
      d += ((j % 2 == 0)?1:-1) * m[0][j] * determinant(n);
    }
    return d;
  }
}
