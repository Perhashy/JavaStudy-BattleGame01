package battle01;

public class Battle {
  public static void playerTurn(int computerHP) {
    System.out.println("あなたの攻撃！：１のダメージ！");
    computerHP--;
    System.out.println("敵HP：" + computerHP);
  }
}