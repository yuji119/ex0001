

import java.util.Scanner;
import java.util.Random;

class ex0427{
  public static void main(String[] args){
    Random rand = new Random();
    Scanner stdIn = new Scanner(System.in);

    int lucky = rand.nextInt(100);     //�P����X�X�܂ł̐����𐶐�

    int x1;
    int i=0;
    game:
      do{
        System.out.print("�������ȁF");
        x1 = stdIn.nextInt();
        if(x1>lucky)
          System.out.println("�����Ə��������ł��B");

        else if(x1<lucky)
          System.out.println("�����Ƒ傫�����ł�");

          i++;
          if(i>5){
          System.out.println("������"+lucky+"�ł��B");
          break game;
        }

  }while (x1!=lucky);
  System.out.println("�����ł��B");
}
}
