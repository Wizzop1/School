public class Kata
{
  public static String[][] matrixSquareUp(int Q)
  {
    String[][] O = new String[Q][Q];
    for (int R,C,F = Q * Q;F --> 0;) O[R = F / Q][C = F % Q] = 1 + R + C < Q ? "x" : Q - C + "";
    return O;
  }
}
