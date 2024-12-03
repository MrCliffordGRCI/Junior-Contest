/* 2024 J2 Dusa and the Yobis
*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int yobaSize=scn.nextInt();
    while(true){
      int input=scn.nextInt();
      if(yobaSize<=input){
        break;
      }
      yobaSize+=input;
    }
    System.out.println(yobaSize);
  }


}