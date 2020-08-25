package battle01;

import java.util.Random;;

public class Character {
  public int hp;
  public int attack;

  int[] arrayHp = {500, 1000, 2000};
  int[] arrayAttack = {100, 250, 500};

  public Character() {
    Random random = new Random();
    this.hp = arrayHp[random.nextInt(3)];
    this.attack = arrayAttack[random.nextInt(3)];
  }

  protected static int playerHP = 5;
  protected static int computerHP = 8;

}