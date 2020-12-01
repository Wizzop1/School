public class Sid {
    public static int sumOfElements(int matrix[][]) {  
      int sum = 0;
      for(int []line: matrix)
        for(int x: line)
          sum+=x;
      return sum;
      
    }    
}
