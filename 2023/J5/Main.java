//2023 J5 CCC Word Hunt

import java.util.*;

class Main {
  public static int rows;
  public static int cols;
  public static String word;
  public static int numberOfWords=0;
  
  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);

    word=scn.nextLine();
    rows=scn.nextInt();
    cols=scn.nextInt();
    scn.nextLine();
    // fill the array with the inputted values
    char arr[][]=new char[rows][cols];
    for (int i=0;i<rows;i++){
      for (int j=0;j<cols;j++){
        arr[i][j]=scn.next().charAt(0);
      }
    }

    //search for the first letter of the inputted word
    for (int i=0;i<rows;i++){
      for (int j=0;j<cols;j++){
        if (arr[i][j]==word.charAt(0)){
          //if the first letter is found do a Depth First Search Algorthm around each possible letter around the current one
          dfs(0,i,j,0,1,false,arr);
          dfs(0,i,j,0,-1,false,arr);
          dfs(0,i,j,1,0,false,arr);
          dfs(0,i,j,-1,0,false,arr);
          dfs(0,i,j,1,1,false,arr);
          dfs(0,i,j,1,-1,false,arr);
          dfs(0,i,j,-1,1,false,arr);
          dfs(0,i,j,-1,-1,false,arr);   
        }
      }
    }
    System.out.println(numberOfWords);
  }

  // The depth keeps track of how many correct letters we find. If a correct letter is found, we continue along the words correct change in x values and  change in y values. Assume the first letter is at (0,0)

  
  public static void dfs(int depth, int x, int y, int dx, int dy,boolean turned, char arr [][]){
    //if we are at the boundries we can't search anymore
    if (x<0||y<0||x>=rows||y>=cols){
        return;
    }
    //if the next letter isn't found around the current letter return.
    if (arr[x][y]!=word.charAt(depth)){
      return;
    }
    //if the depth is equal to the length of the word then we found a solution
    if(depth==word.length()-1){
      numberOfWords++;
      return;
    }
    //the main recursive call where we check to see if the next letter in the same direction is correct.
    
    dfs(depth+1,x+dx,y+dy,dx,dy,turned,arr);

    // this if statement deals with the 90 degree turns. A reminder you can only turn once and you can't turn
    // on the first letter.
    if (depth>=1 && turned==false){
      dfs(depth+1,x-dy,y+dx,-dy,dx,true,arr);
      dfs(depth+1,x+dy,y-dx,dy,-dx,true,arr);
    }
  }
}