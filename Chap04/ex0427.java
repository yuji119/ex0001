

import java.util.Scanner;
import java.util.Random;

class ex0427{
  public static void main(String[] args){
    Random rand = new Random();
    Scanner stdIn = new Scanner(System.in);

    int lucky = rand.nextInt(100);     //‚P‚©‚ç‚X‚X‚Ü‚Å‚Ì®”‚ğ¶¬

    int x1;
    int i=0;
    game:
      do{
        System.out.print("‚¢‚­‚Â‚©‚ÈF");
        x1 = stdIn.nextInt();
        if(x1>lucky)
          System.out.println("‚à‚Á‚Æ¬‚³‚¢”‚Å‚·B");

        else if(x1<lucky)
          System.out.println("‚à‚Á‚Æ‘å‚«‚¢”‚Å‚·");

          i++;
          if(i>5){
          System.out.println("³‰ğ‚Í"+lucky+"‚Å‚·B");
          break game;
        }

  }while (x1!=lucky);
  System.out.println("³‰ğ‚Å‚·B");
}
}
