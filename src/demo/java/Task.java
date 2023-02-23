package demo.java;

public class Task {
  public static void main(String [] args) {
	 String [] name =new String [] {"Mani", "Srini", "Mani", "Srini","jack","jack" };
	 for (int i = 0; i < name.length; i++) {
		 for (int j =i + 1;j < name.length; j++  ) {
		 if (name [i]== name [j]) {
		 
		 
		 System.out.println(name[j]);
		 
	 }
	 }      
	 }
  }
}