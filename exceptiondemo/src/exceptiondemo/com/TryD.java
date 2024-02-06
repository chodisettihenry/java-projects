package exceptiondemo.com;




public class TryD {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
				
		try  
	        {  
	        int data=50/0;   
	       
	        }  
	            
	        catch(ArithmeticException e)  
	        {  
	            System.out.println(e);
	            e.printStackTrace();
	            System.out.println(e.getMessage());
	            
	           
	            System.out.println("we cannot divide by zero");
	        }  
	        System.out.println("rest of the code");  
             
	}

}
