package importingPackage;

public class UsingFinal {
	final static double pi = 3.141;
	
	public static void main(String[] args) {
		int radius = 4;
		float diameter = 2;
		System.out.println("Area of circle is : " + (pi*radius*radius*diameter));
		System.out.println("Diameter of the circle is : " + (2*radius));
	}
	

}

