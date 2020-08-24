package battle01;

public class Battle {
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

  
}