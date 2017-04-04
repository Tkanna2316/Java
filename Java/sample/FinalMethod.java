package sample;
class FinalMethod
{
		   final void demo(){
		      System.out.println("xyz method");
		   }  
		}  
			     
		class CDE extends FinalMethod
		{
		   
		   public static void main(String args[]){  
		      CDE obj= new CDE();  
		      obj.demo();  
		   }  
		}
		
		