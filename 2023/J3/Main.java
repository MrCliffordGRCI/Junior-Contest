//2023 J3 Special Event

import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int numberOfPeople=scn.nextInt();
    scn.nextLine();
    int days[]=new int[5];
    String input;

    //adding the number of attendees in an array that has an element for each day
    for (int i=0;i<numberOfPeople;i++){
      input=scn.nextLine();
      for (int j=0;j<input.length();j++){
        if(input.charAt(j)=='Y'){
          days[j]+=1;
        }
      }
    }

    //finding the day with max number of attendees
    int max=0;// the number of the attendees on the max day
    int maxIndex=0; // the actual day of the max attendees
    for (int i=0; i<days.length;i++){
      if(days[i]>max){
        max=days[i];
        maxIndex=i;
      }
    }

    // printing the days. A remidner to shift indices by 1 since strings go 0-4 but days go 1-5
    System.out.print(maxIndex+1);
    for (int i=0; i<5;i++){
      if (i!=maxIndex && days[i]==days[maxIndex]){
        System.out.print(","+(i+1));
      }
    }
  }
}