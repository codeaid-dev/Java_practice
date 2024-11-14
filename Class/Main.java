public class Main {
  public static void main(String[] args) {
    Sprite h1 = new Sprite("えにくす",1);
    Sprite h2 = new Sprite("えにくす",1);
    System.out.println(h1 == h2);
    System.out.println(h1.equals(h2));
  }
}
