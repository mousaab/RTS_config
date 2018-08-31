package test;

public class Vehicle {                
	   public static int count;                
	   public Vehicle() {                
	       Vehicle.count();        
	   }                        

	   public static void count() {                
	      count = count + 1;        
	   }    
	   public static void main(String []args)
	   {
		   Vehicle.count();
		   System.out.println(Vehicle.count);
		   Vehicle v1=new Vehicle();
		   System.out.println(Vehicle.count);
		   Vehicle v2=new Vehicle();
		   System.out.println(Vehicle.count);
	       
	   }
	}
