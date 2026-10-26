public class Main {
  public static void main(String[] args) {
    Season data = Season.SPRING;
    if (data == Season.SPRING) {
      System.out.println("季節は春");
    }

    Season season = Season.SUMMER;

    switch (season) {
        case SPRING -> System.out.println("桜の季節です");
        case SUMMER -> System.out.println("海が綺麗な季節です");
        case AUTUMN -> System.out.println("紅葉の季節です");
        case WINTER -> System.out.println("雪が降る季節です");
    }
  }
}
