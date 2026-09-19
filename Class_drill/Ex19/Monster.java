import java.util.Random;

public class Monster extends Sprite {
  public Monster(String name, int hp) {
    super(name, hp);
  }
  public int heal() {
    Random rand = new Random();
    int heal = rand.nextInt(26) + 25;
    super.hp = super.hp + heal;
    return heal;
  }
}
