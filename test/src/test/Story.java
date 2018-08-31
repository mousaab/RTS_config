package test;

public class Story{        

	   public static void main(String[] args) {                                
	                 
	      Raven raven = new Raven();                                
	      Flyable[] hotPursuit = new Flyable[2];
	      // snippet 1                
	                 
	      hotPursuit[1] = raven;                

	      for (int i = 0; i < hotPursuit.length; i++) {                   
	         hotPursuit[i].fly();                
	      }        
	   }
	}