

import java.util.Scanner;
import java.util.Random;

class ex0427{
  public static void main(String[] args){
    Random rand = new Random();
    Scanner stdIn = new Scanner(System.in);

    int lucky = rand.nextInt(100);     //１から９９までの整数を生成

    int x1;
    int i=0;
    game:
      do{
        System.out.print("いくつかな：");
        x1 = stdIn.nextInt();
        if(x1>lucky)
          System.out.println("もっと小さい数です。");

        else if(x1<lucky)
          System.out.println("もっと大きい数です");

          i++;
          if(i>5){
          System.out.println("正解は"+lucky+"です。");
          break game;
        }

  }while (x1!=lucky);
  System.out.println("正解です。");
}
}
