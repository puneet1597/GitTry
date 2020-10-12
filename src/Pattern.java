/*                        Q3. Write a java program to print the following patterns  -
 

	                                     1 2 3 4 5 6 7
	                                     1 2 3 4 5 6 
	                                     1 2 3 4 5
	                                     1 2 3 4
	                                     1 2 3
	                                     1 2
	                                     1      
	                                                                                       */

public class Pattern 

{

	public static void main(String[] args) 
	
	{
		
		int i,j;    // Instance Variable
		
		// LOGIC
		
		for(i=1; i<=7; i++)
		
		{
			
			int count = 1;  
			
		for (j=i; j<=7; j++) {
			
			System.out.print(" " + count);
			
			count++;
		}
		
		System.out.println();
			
		}
			
	}
	
}
