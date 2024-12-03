//2023 J1 Deliv-e-droid

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);

    int p=scn.nextInt();
    int c=scn.nextInt();
    int points=p*50-c*10;

    if (p>c){
      points=points+500;
    }

    System.out.println(points);
  }
}