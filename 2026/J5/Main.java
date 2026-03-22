/*CCC 2026 J5/S2  Beams of totalLights
In order to get time efficency you have to use a difference array and prefix sum
Java kind of sucks for this one as the Scanner Object is too inefficent. Buffered reader is much faster..
Just use Python.....



*/
import java.util.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws IOException 
	{
	    //inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalSpots = Integer.parseInt(br.readLine());
        int totalLights = Integer.parseInt(br.readLine());
        int totalQuestions = Integer.parseInt(br.readLine());
        
        //set up variables before hand to reduce computation time
        int[] parking=new int[totalSpots+2];//+1 for right edge and another +1 to ignore the 0 index
        int[] litSpots=new int[totalSpots+1]; //just +1 to ignore index
        int spot=0;
        int spread=0;
        int left=0;
        int right=0;
        String input="";
        StringTokenizer st;
        
        /* This is the part that establishes where the light starts and ends. If a light starts at spot 4 and has spread 2,
           then we put a 1 on spot 2 because that is where this light starts. We puts a -1 on the spot to the right of where it ends
           which in this case is spot 7.
         */
        for (int i=0;i<totalLights;i++){
            st = new StringTokenizer(br.readLine());
            spot=Integer.parseInt(st.nextToken());
            spread=Integer.parseInt(st.nextToken());
            left=Math.max(1,spot-spread);//this is in case the beam spreads over the far left boundry. It forces a 1 in spot 1
            right=Math.min(parking.length-1,spot+spread+1);//this is in case the beam spreads over the far right boundry. It forces a 1 on the last spot
            parking[left]++;
            parking[right]--;
        }
        /* prefix sum. Each spot's value is the running total of the previous parking spots number. It literally keeps track of how much
           light each spots gets.
         */
        for (int i=1;i<litSpots.length;i++){
            litSpots[i]=parking[i]+litSpots[i-1];
        }
        
        //Output if current spot is lit or not
        int questionedSpot;
        for (int i=0;i<totalQuestions;i++){
            questionedSpot=Integer.parseInt(br.readLine());
            if(litSpots[questionedSpot]>=1){
                System.out.println("Y");
            }else{
                System.out.println("N");
            }
        }

	}
}
