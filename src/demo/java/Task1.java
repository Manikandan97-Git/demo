package demo.java;

public class Task1 {
	public static void main (String [] args) {
		int viratCount = 0, dhoniCount = 0, rohitCount = 0, pandyaCount = 0;
		String [] player = {"virat","virat","virat","dhoni","dhoni","dhoni","dhoni","rohit","rohit","pandya","pandya","pandya","pandya","pandya","pandya"};
		 for (int i = 0; i < player.length; i++ ) {
			 if (player[i]=="virat") {
				 viratCount++;
			 }if (player[i]=="dhoni") {
					 dhoniCount++;
			 }if(player[i]=="rohit") {
						 rohitCount++;
			 }if (player[i]=="pandya") {
							 pandyaCount++;
			 }
		 }
							System.out.println("Virat count is " + viratCount);
							System.out.println("Dhoni count is "  + dhoniCount);
							 System.out.println("Rohit count is " + rohitCount);
							 System.out.println("Pandya count is " + pandyaCount);
						 }
					 }
	
			 
			 
		 
		
	


