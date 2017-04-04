package sample;

public final class FinalVariable {



		   final int MAX_VALUE=99;
		   void myMethod(){  
			   System.out.println(MAX_VALUE);
		     
		   }  
		   public static void main(String args[]){  
			   FinalVariable obj=new  FinalVariable();  
		      obj.myMethod();  
		   }  
}

