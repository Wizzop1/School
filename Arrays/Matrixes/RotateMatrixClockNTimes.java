class Kata {

  static int[][] rotateCounterclockwise(int[][] m, int t) {
    int l = m.length, k = l-1;
    while (t-- % 4 != 0) {
      for (int i = 0; i < l; i++)
        for (int j = 0; j < l-i; j++) {
          int v = m[j][i];
          m[j][i] = m[k-i][k-j];
          m[k-i][k-j] = v;
        }
      for (int i = 0; i < l/2; i++)
        for (int j = 0; j < l; j++) {
          int v = m[j][i];
          m[j][i] = m[j][k-i];
          m[j][k-i] = v;
        }
    }
    return m;
  }

}
