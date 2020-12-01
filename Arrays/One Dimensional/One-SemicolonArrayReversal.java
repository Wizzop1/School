public class Reverser {
  
  public static int[] reverse(int[] a) {

    return 
    
      a.length <= 1 ? a :  
      
      java.util.stream.IntStream.concat( 

        java.util.stream.IntStream.of(
          reverse(java.util.stream.IntStream.of(a).skip(1).toArray())
        ),

        java.util.stream.IntStream.of(new int[]{a[0]})
      ).toArray();
  }
  
}
