package set.com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetsCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	 Set<Integer> s = new HashSet<>();
//	 
//	 s.add(20);
//	 s.add(5);
//	 s.add(70);
//	 s.add(20);
//	 
//	 
//	 System.out.println(s);
	 
		
		//it follows insertion order
//		Set<Integer> s = new LinkedHashSet<>();
//		 
//		 s.add(20);
//		 s.add(5);
//		 s.add(70);
//		 s.add(20);
//		 
//		 
//		 System.out.println(s);
		
		
		
		
		//it follows sorted oreder
		SortedSet<Integer> s = new TreeSet<>();
		 
		 s.add(20);
		 s.add(5);
		 s.add(70);
		 s.add(20);
		 
		 
		 System.out.println(s);
		 
	 

	}

}
