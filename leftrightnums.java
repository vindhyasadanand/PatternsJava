/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int n = 4;
	for(int i=1;i<=n;i++)
	{
	    int k=1,m=1;
	   int l=i;
	    for(int j=1;j<=(2*n)-1;j++)
	    {
	        if(i>=j|| j >= (2*n)-i)
	        {
	            if(j>=(2*n)-i)
	            {
	               System.out.print( l  ); 
	                l--;
	            }
	            else{
	            	System.out.print(k );
	            	k++;
	            }
	        }
	        else
	        {
	            	System.out.print(" ");
	        }
	    }
	    
	    	System.out.println();
	}
	}
}
