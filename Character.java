package battle01;

import java.util.Random;;

public class Character {
  private int hp;
  private int attack;
  private int hitRate;

  int[] arrayHp = {500, 1000, 2000};
  int[] arrayAttack = {100, 250, 500};
  int[] arrayHit = {30, 50, 70, 90};

  public Character() {
    Random random = new Random();
    this.hp = arrayHp[random.nextInt(arrayHp.length)];
    this.attack = arrayAttack[random.nextInt(arrayAttack.length)];
    this.hitRate = arrayHit[random.nextInt(arrayHit.length)];
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public int getHp() {
    return this.hp;
  }

  public int getAttack() {
    return this.attack;
  }

  public int getHit() {
    return this.hitRate;
  }
}