public class FindThePoison {

    public int find(int[] rats) {
        int bottle = 0;
        for (int rat: rats) {
          bottle += Math.pow(2, rat);
        }
        return bottle;
    }
}
