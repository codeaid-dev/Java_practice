public class Hero extends Sprite {
  private int skill;
  public Hero(String name,int hp) {
    super(name, hp);
    this.skill = 40;
  }
  public int specialAttack(Sprite monster) {
    monster.hp = monster.hp - this.skill;
    return this.skill;
  }
}
