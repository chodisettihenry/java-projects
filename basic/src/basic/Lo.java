package basic;

import java.io.Console;
 class prasad{
	  String myvariable;
	  
	  
	  //Integer
	  byte a = 2;
	  short b = 271;
	  int c=  3451;
	  long d= 368899;
	  
	  
	  
	  //float
	  
	  float e  = 3.1f;
	  double f = 45.7687d;
	  
	 
	  
	  
	  
	  
	 
	public void Prasadmethod() {
		int localVariable;
		System.out.println("i am the super class method");
	}
	
	
}

public class Lo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int aa[]= {1,2,3,4,5,6};
		  {
		  
		  
		  
		  
		  for(int daa:aa) {
			 System.out.println(daa); 
			  
		  }
		  System.out.println();
		  
		  }
		
		int a;
		double abc = 0.88899d;
		
		prasad obj = new prasad();
		prasad obj1 = new prasad();
		obj1.Prasadmethod();
		obj.Prasadmethod();
		
		
		
		

	}
	static {
		System.out.println("your are thoppu");
	}
	

}
