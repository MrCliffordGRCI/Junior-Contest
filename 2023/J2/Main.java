//2023 J2 Chili Peppers

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);

    int numberofChillis=scn.nextInt();
    //we use scn.nextLine to advance the line after using nextInt
    scn.nextLine();
    int total=0;
    for (int i=0;i<numberofChillis;i++){
      String type=scn.nextLine();

      switch(type){
        case "Poblano":
          total+=1500;
          break;
        case "Mirasol":
          total+=6000;
          break;
        case "Serrano":
          total+=15500;
          break;
        case "Cayenne":
          total+=40000;
          break;
        case "Thai":
          total+=75000;
          break;
        case "Habanero":
         total+=125000;
          break;
      }
    }
    System.out.println(total);
  }
}