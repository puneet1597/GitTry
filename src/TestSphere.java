

import java.util.Scanner;

public class TestSphere 

{
	public static void main(String args[]) 
	
	{
		System.out.println("enter the radius: ");
		
		Scanner scan = new Scanner(System.in);
		
	    double r = scan.nextInt();    
	     
		Sphere obj = new Sphere(r);    //object
		
		double area = obj.area();      //calling method area 
		
		System.out.println("area: " + area);
		
		double volume = obj.vol();     //calling method volume
		
		System.out.println("volume: " +volume);
		
		scan.close();
		
		
	}

}
