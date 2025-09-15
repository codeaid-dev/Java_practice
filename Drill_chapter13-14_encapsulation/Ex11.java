class Student {
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

public class Ex11 {
  public static void main(String[] args) {
    Student st1 = new Student("山田太郎", 70);
    System.out.println("名前："+st1.getName()+"スコア："+st1.getScore());
    Student st2 = new Student("田中二郎", -1);
  }
}
