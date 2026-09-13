public class Ex9 {
  public static void main(String[] args) {
    int[][] scores = {
        {70, 125, 5},
        {214, 7, 85}
    };
    String result = "";
    for (int i = 0; i < scores.length; i++) {
      for (int j = 0; j < scores[i].length; j++) {
        result += scores[i][j] + "\t";
        // System.out.print(scores[i][j] + "\t");
      }
      result += "\n";
      // System.out.println();
    }
    System.out.println(result.trim());
  }
}
