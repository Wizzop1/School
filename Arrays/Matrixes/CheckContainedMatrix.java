import java.util.Arrays;
public class Kata {
  public static int[] checkIsContained(int[][] mat1, int mat2[][]) {
        for(int y = 0; y <= mat1.length - 3; y++)
            for(int x = 0; x <= mat1[0].length - 3; x++)
                if(
                    Arrays.compare(mat1[y], x, x + 3, mat2[0], 0, 3) == 0 &&
                    Arrays.compare(mat1[y + 1], x, x + 3, mat2[1], 0, 3) == 0 &&
                    Arrays.compare(mat1[y + 2], x, x + 3, mat2[2], 0, 3) == 0
                ) return new int[] {y, x};

        return new int[] {-1, -1};
  }
}
