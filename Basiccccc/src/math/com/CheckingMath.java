package math.com;

	public class CheckingMath {
		public void mathMax() {
			System.out.print("math.max = ");
			System.out.println(Math.max(10, 6));
			}
		public void mathMin() {
			System.out.print("math.min = ");

			System.out.println(Math.min(6, 10));
		}
		public void mathSqrt() {
			System.out.print("math.Sqrt = ");
			

			System.out.println(Math.sqrt(64));
		}
		public void mathabs() {
			System.out.print("math.abs = ");

			System.out.println(Math.abs(-64));  
		}
		public void mathrandom() {
			System.out.println("math.random = "+Math.random()); 
			double a = Math.random()*100;
			
			System.out.println(a);
		}
		public void StringtoInt() {
			int a = Integer.parseInt("12");
			int b = Integer.parseInt("12");
			System.out.println("String to Int "+(a+b));
		}
		public void stringtoDouble() {
			Double d = new Double("65.5");
		      //String str = "55";
		      System.out.println("String to Double " +  d.valueOf("55"));
		}
		public void objtoString() {
			Object obj = new Integer(42);
			Object obj1 = new Double(20.0);
			String str = String.valueOf(obj);
			String str1 = String.valueOf(obj1);
			
			System.out.println("Object to String "+str+"  "+str1);
		}
		

		public static void main(String[] args) {
			
			// TODO Auto-generated method stub
			CheckingMath obj = new CheckingMath();
			obj.mathMax();
			obj.mathMin();
			obj.mathSqrt();
			obj.mathabs();
			obj.mathrandom();
			obj.StringtoInt();
			obj.stringtoDouble();
			obj.objtoString();

		}


	
}

