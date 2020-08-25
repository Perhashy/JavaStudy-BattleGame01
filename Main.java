package battle01;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    Character player = new Character();
    Character computer = new Character();

    System.out.println(player.getHp());
    System.out.println(player.getAttack());
    System.out.println(computer.getHp());
    System.out.println(computer.getAttack());

    System.out.println("敵が現れた！");
    System.out.println("");
    System.out.println("(*ﾟ▽ﾟ*)");
    System.out.println("敵HP：" + Character.computerHP);
    System.out.println("");

    do {
      Scanner sc = new Scanner(System.in);
      System.out.println("どうする？");
      System.out.print("(1：攻撃、2：逃げる)：");
      try {
        int command = sc.nextInt();
        if (command == 1) {
          // 先制攻撃
          Battle.playerTurn();
        } else {
          // 逃げ成功判定（仮で出力）
          Battle.escape();
        }
      } catch (InputMismatchException e) {
        System.out.println("逃げるのに失敗した");
      }

      Battle.computerTurn();
    } while(Battle.check());
  }
}