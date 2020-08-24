package battle01;

import java.util.Random;

public class Battle {
  public static void escape() {
    Random random = new Random();
    int escape = random.nextInt(3);
    switch (escape) {
      case 0:
        System.out.println("逃げることに成功した！");
        System.exit(0);
      case 1:
        System.out.println("逃げることに失敗した");
      default:
        System.out.println("逃げることに失敗した");
    }
  }

  public static void playerTurn() {
    System.out.println("あなたの攻撃！：１のダメージ！");
    Character.computerHP--;
    System.out.println("敵HP：" + Character.computerHP);
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