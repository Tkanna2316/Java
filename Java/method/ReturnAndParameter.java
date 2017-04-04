package method;

public class ReturnAndParameter {

	String printString(String val)
	{
		return "Hello"+val;
	}
	public static void main(String[] args) {
		ReturnAndParameter obj = new ReturnAndParameter();
		String val="Tanmaie";
		System.out.println(obj.printString(val));
	}
}
