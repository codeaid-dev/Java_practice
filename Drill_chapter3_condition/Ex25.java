public class Ex25 {
  public static void main(String[] args) {
    int heads = 35;
    int legs = 94;
    for (int rabbits = 0; rabbits <= heads; rabbits++) {
      int chikens = heads-rabbits;
      if (2*chikens+4*rabbits == legs) {
        System.out.println("兎は" + rabbits + "匹、鶏は" + chikens + "羽");
      }
    }
  }
}
