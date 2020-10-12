/*                     Q1. Write a java program to find volume and surface area of a sphere using multiple classes?
 
                       Note :
                       
                           Surface Area of Sphere = 4 * Math.PI * radius* radius
                           Volume of Sphere = 4/3 * Math.PI * radius * radius * radius
                           Use constructor to set radius
                           User Scanner to take user input  
                                                                                                                              */
public class Sphere 

{
	
	private double radius;
	
	public Sphere(double radius)     // Constructor
	
	{
		
	this.radius =radius;
	
	}
	
	double ar;
	
    public double area()          
   
    {
		
		ar = 4*Math.PI*this.radius*this.radius;
		return ar;
	}
    
    double vol;
    
    public double vol()
    
    {
		
		vol = (4*Math.PI*this.radius*this.radius*this.radius)/3;
		return vol;
	}

}

