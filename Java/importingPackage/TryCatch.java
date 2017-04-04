package importingPackage;

public class TryCatch {

	public static void main(String[] args) {
		int a= 10;
		int b = 0;
	    int c = 5;
		try{		// try
			c= a/b;
			System.out.println(c);
		}
		catch(Exception e){ // catching when it fails 
			System.out.println("RunTime error divide by zero");
		}
		finally {
			System.out.println("Finally block");
			System.out.println("The value of c is:" + (c = a+b) );
		}
	}
}
