import java.util.Arrays;
import java.util.stream.Collectors;

public class JomoPipi{

    public static char[][] diagonalSort(char[][] data ) {
      
         String word = Arrays.stream(data).map(String::valueOf).collect(Collectors.joining());
      
         int idx=0;
      
         char[][] ret = new char[data.length][data[0].length];
      
         int ROW = data.length, COL = data[0].length;
      
         for (int i = 1; i <= (ROW + COL - 1); i++) {
             int start = Math.max(0, i - ROW),
                 count = Math.min(i, Math.min((COL - start), ROW));

             for (int j = 0; j < count; j++)
                 ret[Math.min(ROW, i) - j - 1][start + j] = word.charAt(idx++); 
         }
         
         return ret;
    }
    
