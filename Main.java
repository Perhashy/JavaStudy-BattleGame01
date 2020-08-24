package battle01;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    int playerHP = 5;
    int computerHP = 8;

    System.out.println("敵が現れた！");
    System.out.println("");
    System.out.println("(*ﾟ▽ﾟ*)");
    System.out.println("敵HP：" + computerHP);
    System.out.println("");

    do {
      Scanner sc = new Scanner(System.in);
      System.out.println("どうする？");
      System.out.print("(1：攻撃、2：逃げる)：");
      try {
        int command = sc.nextInt();
        if (command == 1) {
          // 先制攻撃
          System.out.println("あなたの攻撃！：１のダメージ！");
          computerHP--;
          System.out.println("敵HP：" + computerHP);
        } else {
          // 逃げ成功判定（仮で出力）
          System.out.println("逃げるのに失敗した");
        }
      } catch (InputMismatchException e) {
        System.out.println("逃げるのに失敗した");
      }

      if (computerHP > 0) {
        System.out.println("敵の攻撃！：１のダメージ！");
        playerHP--;
        System.out.println("あなたのHP：" + playerHP);
        if (playerHP <= 0) {
          System.out.println("敵に倒された");
        }
      } else {
        System.out.println("敵を倒した！");
      }
    } while(playerHP > 0 && computerHP > 0);
  }
}