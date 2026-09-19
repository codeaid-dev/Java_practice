public class Student {
  private String name;
  private int score;

  public Student(String name, int score) {
    this.name = name;
    setScore(score);
  }

  public String getName() { return name; }

  public int getScore() { return score; }

  public void setScore(int score) {
    if (score < 0 || score > 100) {
      throw new IllegalArgumentException("スコアは0〜100でなければなりません");
    }
    this.score = score;
  }
}
