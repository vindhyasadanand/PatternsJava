/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args)
	{
	  int n=4;
	  for(int i=1;i<=n;i++)
	  {
	      for(int k=n;k>i;k--)
	      {
	          System.out.print(" ");
	          
	      }
	      for(int j=1;j<=i;j++)
	      {
	          System.out.print("*"+ " ");


	      }
	         System.out.println();
	  }
	  for(int j=1;j<=n-1;j++)
	  {
	      for(int i=1;i<=j;i++)
	      {
	          System.out.print(" ");
	      }
	      for(int k=1;k<=n-j;k++)
	      {
	          System.out.print("*"+" ");
	      }
	      System.out.println();
	  }
	}
}
