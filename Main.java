package battle01;

public class Main {
  public static void main(String[] args) {
    int playerHP = 5;
    int computerHP = 8;

    System.out.println("敵が現れた！");
    System.out.println("");
    System.out.println("(*ﾟ▽ﾟ*)");
    System.out.println("");

    do {
      System.out.println("冒険者が敵に１のダメージ！");
      computerHP--;
      System.out.println("敵HP：" + computerHP);
      if (computerHP != 0) {
        System.out.println("敵が冒険者に１のダメージ！");
        playerHP--;
        System.out.println("冒険者HP：" + playerHP);
        if (playerHP == 0) {
          System.out.println("敵に倒された");
        }
      } else {
        System.out.println("敵を倒した");
      }
    } while(playerHP > 0 && computerHP > 0);
  }
}