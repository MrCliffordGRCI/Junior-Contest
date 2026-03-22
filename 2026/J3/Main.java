//Junior Q3 2026
// This can be made simpler using more in depth java functions


import java.util.*;


public class Main
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		String ngocCandy=scn.nextLine();
	    String minhCandy=scn.nextLine();
	    char minhChoice=' ';
	    int minhCounter=0;
	    int ngocCounter=0;
	    char ngocChoice=' ';
	    int mIndex=0;
	    int nIndex=0;
	    
	    
	    //To make this work for time you cannot delete characters from an array or string. Instead we use an index to keep track of where
	    // we are in the respected strings.
	    while (mIndex<minhCandy.length()&&nIndex<ngocCandy.length()){
	        minhChoice=minhCandy.charAt(mIndex);
	        ngocChoice=ngocCandy.charAt(nIndex);
	        
	        //determine who eats what.
	        if(minhChoice=='R'){
	            if(ngocChoice=='G'){
	                nIndex++;
	                minhCounter++;
	            }else if(ngocChoice=='B'){
	                mIndex++;
	                ngocCounter++;
	            }else{
	                minhCounter++;
	                ngocCounter++;
	                nIndex++;
	                mIndex++;
	            }
	        }else if(minhChoice=='G'){
	            if(ngocChoice=='R'){
	                mIndex++;
	                ngocCounter++;
	            }else if(ngocChoice=='B'){
	                nIndex++;
	                minhCounter++;
	            }else{
	                minhCounter++;
	                ngocCounter++;
	                nIndex++;
	                mIndex++;
	            }
	        }else{
	            if(ngocChoice=='R'){
	                nIndex++;
	                minhCounter++;
	            }else if(ngocChoice=='G'){
	                mIndex++;
	                ngocCounter++;
	            }else{
	                minhCounter++;
	                ngocCounter++;
	                nIndex++;
	                mIndex++;
	            }
	        }
	        
	    }
	    //Whomever has candies left eats them all
	    if(minhCandy.length()-mIndex==0){
	        ngocCounter+=(ngocCandy.length()-nIndex);
	    }else{
	        minhCounter+=(minhCandy.length()-mIndex);
	    }
	    
	    System.out.println(ngocCounter);
	    System.out.println(minhCounter);

	}
}
