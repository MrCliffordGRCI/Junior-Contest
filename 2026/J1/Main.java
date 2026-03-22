import java.util.*;


public class Main
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int B=scn.nextInt();
		int T=scn.nextInt();
		int P=scn.nextInt();
		int difference=T-P; //this is the amount of tickets available to purchase
		if(B>difference){
		    System.out.println("N");
		}else{
		    System.out.println("Y "+(difference-B));
		}

	}
}
