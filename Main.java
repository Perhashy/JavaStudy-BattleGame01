package battle01;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    Character player = new Character();
    Character computer = new Character();

    System.out.println("--------------------------------");
    System.out.println("敵が現れた！");
    System.out.println("--------------------------------" + "\n");
    System.out.println("(*ﾟ▽ﾟ*)");
    System.out.println("敵HP：" + computer.getHp() + "\n");
    System.out.println("--------------------------------");
    System.out.println("あなたHP：" + player.getHp());

    do {
      Scanner sc = new Scanner(System.in);
      System.out.println("--------------------------------");
      System.out.println("どうする？");
      System.out.print("(1：攻撃、2：逃げる)：");
      try {
        int command = sc.nextInt();
        System.out.println("--------------------------------");
        if (command == 1) {
          // 先制攻撃
          Battle.playerTurn(player, computer);
        } else {
          // 逃げ成功判定（仮で出力）
          Battle.escape();
        }
      } catch (InputMismatchException e) {
        System.out.println("逃げるのに失敗した");
      }

      Battle.computerTurn(player, computer);
    } while(Battle.check(player.getHp(), computer.getHp()));
  }
}