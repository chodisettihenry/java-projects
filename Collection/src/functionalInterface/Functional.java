package functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Integer> con = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				
				System.out.println(t*t);
				
			}
				
			
			
		};
		con.accept(45);
		
		
		System.out.println(45*45);
		
		

        Predicate <Integer> prt=new Predicate<Integer>() {


       public boolean test(Integer num) {;
           
               return num%2==0;
           }
       };
       System.out.println("Number is even: "+prt.test(6));
                   System.out.println("Number is even:: "+prt.test(7));
	
	
	
	Supplier<String> s= new Supplier<>() {

		@Override
		public String get() {
			// TODO Auto-generated method stub
			
			double a = Math.random()*2000000;
			int c = (int)a;
			String b = String.valueOf(c);
			return b;
		}
		
	};
	System.out.println(s.get());
	
	Function<String,Integer> f = new Function<>() {

		@Override
		public Integer apply(String t) {
			// TODO Auto-generated method stub
			
			
			
			return Integer.valueOf(t);
		}
		
	};
	
	//int value1 = f.apply("77");
	System.out.println(f.apply("55"));
	
	Function<Integer,String> fun = new Function<>() {

		@Override
		public String apply(Integer t) {
			// TODO Auto-generated method stub
			return String.valueOf(t);
		}
		
	};
	
	//String value = fun.apply(30);
	
	
	System.out.println(fun.apply(20));

	}

}
