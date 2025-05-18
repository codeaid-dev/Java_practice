public class Ex27 {
  public static void main(String[] args) {
    int[][] matrix = {
        {70, 80, 90},
        {60, 75, 85},
        {88, 92, 100}
    };

    String[] person = {"山田","田中","鈴木"};
    String[] subject = {"国語","数学","英語"};
    int[] sub_count = new int[subject.length];

    for (int i = 0; i < matrix.length; i++) {
      int sum = 0;
      int count = 0;
      for (int j = 0; j < matrix[i].length; j++) {
          sum += matrix[i][j];
          count++;
          sub_count[j] += matrix[i][j];
      }
      double average = (double) sum / count;
      System.out.println(person[i]+"さんの合計点: " + sum);
      System.out.println(person[i]+"さんの平均点: " + average);
    }
    for (int i = 0; i < subject.length; i++) {
      double avr = (double)sub_count[i] / matrix.length;
      System.out.println(subject[i]+"の合計点: " + sub_count[i]);
      System.out.println(subject[i]+"の平均点: " + avr);
    }
  }
}
