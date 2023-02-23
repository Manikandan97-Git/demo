package demo.java;

 public class Mani {
	 
	 public static void main (String[] args){
		 
		 int myAge = 24;
		 int votingAge= 27;
		 
		 if (myAge > votingAge) {
		    System.out.println("You're age is not enough to vote");
		    
		 } else if (myAge != votingAge) {
			System.out.println("you're right to vote");
			
		 } else {
			System.out.println("Neutral");
		 }
	 }
 }