//2023 J4/S1 Trianglane

import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);

    int col=scn.nextInt();
    scn.nextLine();

    int row1[]=new int[col];
    int row2[]=new int[col];
    int total=0;

    //read the data into arrays
    for (int i=0;i<col;i++){
      row1[i]=scn.nextInt();
    }
    // this nextLine pushes the new line forward. Essential when dealing with nextInt on 2 lines
    scn.nextLine();
    for (int i=0;i<col;i++){
      row2[i]=scn.nextInt();
    }


    for(int i=0;i<col;i++){
      //checking row 1. Give 3 for every dark triangle but subtract 2 if the one to the left is black too
      if (row1[i]==1){
        total+=3;
        if(i>=1){
          if(row1[i-1]==1){
            total-=2;
          }
        }
      }
      //checking row 2. Give 3 for every dark triangle but subtract 2 if the one to the left is black too
      if (row2[i]==1){
        total+=3;
        if(i>=1){
          if(row2[i-1]==1){
            total-=2;
          }
        }
      }
      // checks all the row1 and row2 potential clashes. If the both black subtract 2
      if (i%2==0){
        if (row1[i]==1 && row2[i]==1){
          total-=2;
        }
      }
    }
    System.out.println(total);  
  }
}