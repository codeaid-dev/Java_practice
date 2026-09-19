public class Main {
  public static void main(String[] args) {
    Student st1 = new Student("山田太郎", 70);
    System.out.println("名前："+st1.getName()+"スコア："+st1.getScore());
    Student st2 = new Student("田中二郎", -1);
  }
}
