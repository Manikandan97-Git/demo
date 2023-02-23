package demo.java;
import java.util.Scanner;
public class Task_scanner {
  public static void main (String [] args) {
	  Scanner mani = new Scanner(System.in);
		System.out.println("What is your name");
	  String myName = mani.nextLine();
	    System.out.println("My name is " + myName);
	    System.out.println("What is your number");
	    int number = mani.nextInt();
	    System.out.println("My number is " + number);
	}
  }


