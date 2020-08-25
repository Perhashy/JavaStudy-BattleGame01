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

  public static void computerTurn(Character player, Character computer) {
    if (computer.getHp() > 0) {
      System.out.println("敵の攻撃！：" + computer.getAttack() + "のダメージ！");
      int hp = player.getHp() - computer.getAttack();
      player.setHp(hp);
      System.out.println("あなたのHP：" + player.getHp());
      if (player.getHp() <= 0) {
        System.out.println("敵に倒された");
      }
    } else {
      System.out.println("敵を倒した！");
    }
  }

  public static boolean check(int player, int computer) {
    if ((player > 0) &&
        (computer > 0)) {
          return true;
    } else {
      return false;
    }
  }
}