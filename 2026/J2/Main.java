//Junior Q2 2026
// This can be done better with Arraylists or using array functions but is kept simple for gr 11


import java.util.*;


public class Main
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		//score inputs
		int [] scores=new int[5];
		for (int i=0;i<5;i++){
		    scores[i]=scn.nextInt();
		}
		int factor=scn.nextInt();
		
		
		//Finding the largest and smallest value in the array
		int max=scores[0];
		int min=scores[0];
		int maxIndex=0;
		int minIndex=0;
		for (int i=1;i<5;i++){
		    for (int j=0;j<5;j++){
		        if (scores[j]>max){
		            max=scores[j];
		            maxIndex=j;
		        }
		        if (scores[j]<min){
		            
		            min=scores[j];
		            minIndex=j;
		        }
		    }
		}
		
		//caclulate the score
		int score=0;
		for (int i=0;i<5;i++){
            if(i!=maxIndex&&i!=minIndex){//ignore the max and min in the array
                score+=scores[i];
            }
		}
		System.out.println(score*factor);


	}
}
