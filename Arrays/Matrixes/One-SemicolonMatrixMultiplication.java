public class Matrices {
  
    public static int[][] multiply(int[][] a, int[][] b) {
       return (a.length == b[0].length || b.length == a[0].length) ?
                java.util.stream.IntStream.range(0, a.length).mapToObj(operand ->
                        java.util.stream.IntStream.range(0, b[0].length).map(value ->
                                java.util.stream.IntStream.range(0, a[0].length).map(operand1 -> a[operand][operand1] * b[operand1][value]).sum()
                        ).toArray()
                ).toArray(int[][]::new) : null;
    }
  
}
