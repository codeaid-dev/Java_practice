import java.util.Random;

public class Sprite {
  String name;
  int hp;
  public Sprite(String name,int hp) {
    this.name = name;
    this.hp = hp;
  }
  public int attack(Sprite sp) {
    Random rand = new Random();
    int damage = rand.nextInt(6) + 20;
    sp.hp = sp.hp - damage;
    return damage;
  }
}
