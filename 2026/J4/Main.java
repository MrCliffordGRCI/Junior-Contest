//Junior Q4 2026
// 


import java.util.*;


public class Main
{
    public static int slimeCounter=0;
    public static HashSet<String> slimes = new HashSet<String>();
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int moves=scn.nextInt();
		scn.nextLine();

		int currentX=0;
		int currentY=0;
		slimes.add("0 0");//need to add the inital spot to the hashset
		for (int i=0;i<moves;i++){
		    //get next move
		    String nextMove=scn.nextLine();
		    char direction=nextMove.charAt(0);
		    int space=Integer.parseInt(nextMove.substring(1));
		    
		    //move the snail one space at a time using the loops. Each move call the isSlime function
		    switch(direction){
		        case 'N':
		            for (int j=0;j<space;j++){
		                currentY++;
		                isSlime(currentX,currentY);
		            }
		            break;
		        case 'S':
		            for (int j=0;j<space;j++){
		                currentY--;
		                isSlime(currentX,currentY);
		            }
		            break;
		        case 'E':
		            for (int j=0;j<space;j++){
		                currentX++;
		                isSlime(currentX,currentY);
		            }
		            break;
		        case 'W':
		            for (int j=0;j<space;j++){
		                currentX--;
		                isSlime(currentX,currentY);
		            }
		            break;
		        default:
		    }
		}
		System.out.println(slimeCounter);


	}
	//isSlime takes the current X & Y coordinates and sees if it exists in the hash. If not, add it
	//  [2,3] is written as 2 3 in the hashset
	public static void isSlime(int currentX, int currentY){
	    	if(!slimes.contains(currentX+" "+currentY)){
		        slimes.add(currentX+" "+currentY);
		    }else{
		        slimeCounter++;
		    }
	}
}
