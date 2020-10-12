    /*                                  Q2. Write a java program to check the equality of two integer arrays.


                             Notes :
                                      Create two integer array by taking input from user (using Scanner)
                                      Check if both array contains same values                                         */


                    /*   PROGRAM DONE BY FOLLOWING TWO METHODS :
                     
                         1. LOGIC WITH INBUILT FUNCTIONS.
                         
                         2. LOGIC WITHOUT INBUILT FUNCTIONS.   */ 
                         
import java.util.Arrays;

import java.util.Scanner;

public class ComparisonArray

{

	public static void main(String[] args)
	
	{
		
		Scanner sc = new Scanner(System.in);
		
		int arr1_length, arr2_length; 
		
		System.out.println("Enter the length of array 1 : ");
		arr1_length = sc.nextInt();
		
		int arr1[] = new int[arr1_length] ;  // Initializing array 1 
		
		System.out.println("Enter the length of array 2 : ");
		arr2_length = sc.nextInt();
		
		int arr2[] = new int[arr2_length] ;  // Initializing array 2
		
		System.out.println("Enter the values of array 1 : ");
		
		for(int i=0; i<arr1_length; i++)
		
		{
			
			arr1[i] = sc.nextInt();
			
		}
		
		System.out.println("The values of array 1 : ");
		
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("Enter the values of array 2 : ");
	    
		for(int i=0; i<arr2_length; i++) 
			
		{
			
			arr2[i] = sc.nextInt();
			
		}
		
		System.out.println("The values of array 2 : ");
		
		System.out.println(Arrays.toString(arr2));
		
		/* LOGIC WITH INBUILT FUNCTION
	      
	      if(Arrays.equals(arr1, arr2 )) 

       {

        System.out.println("Arrays are same");

       }

       else

      {

       System.out.println("Arrays are not same");

      } */
	     
	    
		// LOGIC WITHOUT INBUILT FUNCTION                              
		
		boolean equals = false;                                              
		
	    if(arr1_length == arr2_length) 
	    
	    {
	    	
	    	for(int i=0; i<arr1_length; i++) 
	    	
	    	{
	    		
	    		if(arr1[i] != arr2[i])
	    		
	    		{
	    			equals = true;
	    			break;
	    			
	    		}
	    		
	         }
	    	
	    	if(equals == true)
	    		
	    	{
	    		
	        System.out.println("Arrays are not equal");
	       
	    	}
	    	
	    	else 
	  
	    	System.out.println("Arrays are equal");
	    	
	        }
	   
	        else 
	    	
	    	System.out.println("Arrays are not equal");  
	    	
	        sc.close();
	        
	   }
	        
}
	

	    	
	    
