package tokenizer.com;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a data");
		String myData =sc.next();
		System.out.println("enter your delimeter");
		sc.nextLine();
		String delimeter = sc.next();
		

		StringTokenizer st1=new StringTokenizer(myData,delimeter);
			System.out.println(st1.countTokens());
				
//				while(st1.hasMoreElements()) {
//					String s1=st1.nextElement().toString();
//					
//					System.out.println(s1);
//				}
//				System.out.println(st1.countTokens());

				
				
				
				while(st1.hasMoreTokens()) {
					String s2 =  st1.nextToken();
					System.out.println(s2);
				}
				System.out.println(st1.countTokens());
	}

}
