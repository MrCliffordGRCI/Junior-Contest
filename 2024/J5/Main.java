/* 2024 J5 Harvest Waterloo
*/

import java.util.*;

public class Main {
  //global variables
  public static int rows;
  public static int cols;
  public static int value=0;//cost of pumpkins

  
  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    rows=scn.nextInt();
    cols=scn.nextInt();
    scn.nextLine();

    
    //set up the field
    char arr[][]=new char[rows][cols];
    for (int i=0;i<rows;i++){
      String input=scn.nextLine();
      for(int j=0;j<cols;j++){
        arr[i][j]=input.charAt(j);
      }
    }
    //farmer's inital position
    int farmerX=scn.nextInt();
    int farmerY=scn.nextInt();

    
    dfs(farmerX,farmerY,arr);
    System.out.println(value);
  }
  public static void dfs(int x,int y,char arr[][]){
    //out of bounds check
    if (x<0||y<0||x>=rows||y>=cols){
        return;
    }
    
    //if you are on a hay bail return 
    if(arr[x][y]=='*'){
      return;
    }
    //add the current space's pumpkin to total
    if(arr[x][y]=='S'){
      value+=1;
    }else if(arr[x][y]=='M'){
      value+=5;
    }else{
      value+=10;
    }

    arr[x][y]='*';//set current position to hay bale "VISTED"
    
    //recursive call the dfs search in all directions
    dfs(x+1,y,arr);
    dfs(x-1,y,arr);
    dfs(x,y+1,arr);
    dfs(x,y-1,arr);
  }
}