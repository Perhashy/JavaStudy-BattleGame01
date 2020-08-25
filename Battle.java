package battle01;

import java.util.Random;

public class Battle {
  public static void escape() {
    Random random = new Random();
    int escape = random.nextInt(3);
    if (escape == 1) {
      System.out.println("逃げることに成功した！");
      System.exit(0);
    } else {
      System.out.println("逃げることに失敗した");
    }
  }

  public static void playerTurn(Character player, Character computer) {
    System.out.println("あなたの攻撃！：" + player.getAttack() + "のダメージ！");
    int hp = computer.getHp() - player.getAttack();
    computer.setHp(hp);
    System.out.println("敵HP：" + computer.getHp());
  }

  public static void computerTurn() {
    if (Character.computerHP > 0) {
      System.out.println("敵の攻撃！：１のダメージ！");
      Character.playerHP--;
      System.out.println("あなたのHP：" + Character.playerHP);
      if (Character.playerHP <= 0) {
        System.out.println("敵に倒された");
      }
    } else {
      System.out.println("敵を倒した！");
    }
  }

  public static boolean check() {
    if ((Character.playerHP > 0) &&
        (Character.computerHP > 0)) {
          return true;
    } else {
      return false;
    }
  }
}