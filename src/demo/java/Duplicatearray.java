package demo.java;

public class Duplicatearray {
	public static void main (String [] args) {
		int cricketCount = 0, hockeyCount = 0, footballCount =0;
		String [] games = {"cricket","cricket","cricket","hockey","hockey","football","hockey","football"};
		  
		  for(byte i = 0; i < games.length; i++) {
			  if (games [i]== "cricket") {
				  cricketCount++;
			  }if (games [i] == "hockey"){
				  hockeyCount++;
			  }if (games [i] == "football") {
				  footballCount++;
			  }
		  }
		  System.out.println("Cricket count is " + cricketCount);
		  System.out.println("Hockey count is " + hockeyCount);
		  System.out.println("Football count is " + footballCount);
				  
			  
		  
		    
		

			}
		
	}


