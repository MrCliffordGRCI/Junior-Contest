/* 2024 J3 Bronze Count
*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int scores[]=new int[n];
    for (int i=0;i<n;i++){
      scores[i]=scn.nextInt();
    }
    int third=0;// the value of third place
    int thirdPlaces=0; // the amount of people with 3rd place
    int tracker=1;// keeep track if we are looking at 1st, 2nd or 3rd place
    Arrays.sort(scores);

    //Collections.reverse(scores);
    for (int i=scores.length-2;i>=0;i--){
      if(scores[i]!=scores[i+1]){
        tracker++;
      }
      if (tracker==3){
        third=scores[i];
        thirdPlaces++;
      }else if(tracker>3){
        break;//stop checking after 3rd place
      }
    }
    System.out.println(third+" "+thirdPlaces);

  }
}