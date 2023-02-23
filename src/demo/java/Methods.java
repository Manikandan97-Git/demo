package demo.java;

  public class Methods {
	public  static  int mani(int a, int b) {
		 int speed;
		 speed = a * b;
		 return speed;
	  }
	  
	  public static void main (String [] args) {
		
		int speedMeter = mani(10,5);
		System.out.println(speedMeter);
		 
	  }
  }