package strings;

public class UsingStrings {
	public static void main(String[] args) {
		String value =  "Tanmaie"; // gets already created value
		// there is no append method. 
	     value = value+" Kanna "; //creates a new reference in the heap as it is immutable
	     System.out.println("Using String: "+value);
	     StringBuffer value1 = new StringBuffer("appended ");
	     value1.append("Using append method"); // mutable
	     System.out.println("Using string Buffer: "+value1);
	     
	     
	     // using StringBuilder
	     StringBuilder value2 = new StringBuilder("appended ");
	     value2.append("Using append method ");
	     System.out.println("Using StringBuilder: "+value2);
	}

}
