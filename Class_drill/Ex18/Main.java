import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Hero hero = new Hero("勇者", 100);
    Monster monster = new Monster("スライム", 120);
    boolean turn = true;
    while (hero.hp > 0 && monster.hp > 0) {
      if (turn) { // Hero turn
        Random rand = new Random();
        int damage = 0;
        if (rand.nextInt(4) == 1) {
          damage = hero.specialAttack(monster);
          System.out.println(hero.name + "のスペシャル攻撃！！");
        } else {
          damage = hero.attack(monster);
        }
        System.out.println(hero.name + "は" + monster.name + "に" + damage + "のダメージを与えた");
        turn = false;
      } else { // Monster turn
        if (monster.hp <= 10) {
          int heal = monster.heal();
          System.out.println(monster.name + "は" + heal + "回復した");
        } else {
          int damage = monster.attack(hero);
          System.out.println(monster.name + "は" + hero.name + "に" + damage + "のダメージを与えた");
        }
        turn = true;
      }
    }
    
    if (hero.hp > 0 && monster.hp <= 0) {
      System.out.println(hero.name + "は" + monster.name + "をやっつけた");
    } else if (hero.hp <= 0 && monster.hp > 0) {
      System.out.println(hero.name + "は" + monster.name + "にやられてしまった・・・");
    } else {
      System.out.println(monster.name + "は逃げてしまった");
    }
    System.out.println(hero.name + "のHP:" + hero.hp + "\n" + monster.name + "のHP:" + monster.hp);
  }
}
