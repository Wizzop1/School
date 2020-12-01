import java.util.*;

public class JomoPipi {
  public static char[][] shift(char[][]m, int n){
  
  List<Character> list = new ArrayList<Character>();
  char[][] rez = new char[m.length][m[0].length];
  int p=0;

  for(int i=0;i<m.length;i++)
    for(int j=0;j<m[0].length;j++)
        list.add(m[i][j]);

  Collections.rotate(list, n);

  for(int i=0; i<m.length; i++)
    for(int j=0; j<m[0].length; j++){
      rez[i][j] = list.get(p);
      p++;
    }
    
  return rez;
  }
}
