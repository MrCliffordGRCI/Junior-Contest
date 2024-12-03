/*   2024 J1 Conveyor Belt Sushi
 */
  
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int r=scn.nextInt();
    int g=scn.nextInt();
    int b=scn.nextInt();
    int total=r*3+g*4+b*5;
    System.out.println(total);
  }

}