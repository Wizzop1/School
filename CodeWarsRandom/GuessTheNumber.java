public class GuesserSolution extends Guesser {

  public int getNumber() {
      
      System.out.println("Test");
      
      int low = 1;
      int high = 1000;
      
      while(true) {
        
        int g = (low+high)/2;
        String r = guess(g);
        if("Too high!".equals(r)) 
          high = g;
        else if("Too low!".equals(r))
          low = g;
        else
          return g;
      }
  }

}
