package exceptiondemo.com;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception{
	MyException(){
		System.out.println("Lenght out");
	}
	MyException(String myexception){
		super(myexception);
	}
}
public class UserDefined {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = 0,year =  0;
		
		try {
		System.out.println("Election Voting. Enter your age: ");
		age= sc.nextInt();
		    try {
			System.out.print("Enter your Year of birth: ");
			year = sc.nextInt();
			System.out.println(age+" Age person is checked for vote Eligilbilty. Birth in year of "+year);
			
	       	}
		    catch(InputMismatchException ex) {
			    System.out.println("Your given input is Wrong. So, please check it. Try again..");
		     }
		     catch(ArithmeticException ee) {
			 System.out.println("It's a numerical error occur. So, check the given input..");
	       	}
		}
		catch(InputMismatchException e) {
			System.out.println("Your given input is different to check your vote eligible");
			
		}
		 catch(ArithmeticException e)  
        {  
         System.out.println("Arithmetic Exception occurs");  
        }
		 catch(Exception e)  
        {  
         System.out.println("Parent Exception occurs");  
        } 
		
	
	
		
		if(age>18&& age<40) {
			throw new MyException("Your Eligible to vote");
		}
		else if(age<18 ) {
			throw new MyException("Your are not Eligible to vote");
		}
		else {
			throw new MyException("Invalid choice to check a eligibility");	
		}
		

	}

}
