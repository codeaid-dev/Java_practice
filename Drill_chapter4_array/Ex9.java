public class Ex9 {
  public static void main(String[] args) {
    int[][] scores = {
        {70, 125, 5},
        {214, 7, 85}
    };

    for (int i = 0; i < scores.length; i++) {
      for (int j = 0; j < scores[i].length; j++) {
        System.out.print(scores[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
