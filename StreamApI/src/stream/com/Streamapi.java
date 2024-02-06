package stream.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class Streamapi {
	
	public static void main(String[] args) {
//		ArrayList<String> names=new ArrayList<>();
//		names.add("Shiva");
//		names.add("Mathew");
//		names.add("Sujatha");
//		names.add("Rahul");
//		names.add("Mahesh");
//		names.add("Ganesh");
//		names.add("Poojitha");
//		names.add("Neelayya");
//		names.add("Kiran");
//
		List<Integer> nums=Arrays.asList(2,6,3,8,3,4,9,1,4,3);
		
       Stream<Integer> nums1=nums.stream();
		
		
//		Stream<Integer> nums4=nums1.skip(3);
		
		// IntStream nums2=IntStream.range(1, 89);
		// IntStream nums3=IntStream.rangeClosed(1, 89);
		
		//nums3.forEach(System.out::println);
		// String [] names3= {"naveen","Chakradhar","satheesh","venkatesh"};
		// Stream<String> str=Arrays.stream(names3);
		// str.forEach(System.out::println);
		
		
		
		
//		Stream<Double> otp=Stream.generate(Math::random).limit(10);
//		 otp.map(t->(int)(t*100000)).forEach(System.out::println);
		 
		 
		// Stream<String> names1=Stream.of("hareesh","sandy","srikanth","kumar","vinod");
		// names1.forEach(System.out::println);
		// names1.forEach(t->System.out.println(t));
		
		
		// Stream<String> names2=names.stream();
		// Stream<String> list=names.stream();
		// Stream<String> filteredlist=list.filter(t->t.startsWith("M"));
		// long count=filteredlist.count();
		// System.out.println(count);
		
		
		//filteredlist.forEach(t->System.out.println(t));
//		System.out.println(names.stream().filter(t->t.startsWith("G")).count());
		 
		 
		 
		Stream<Integer> nums2=nums.stream();
		
		Stream<Integer> filtered=nums2.filter(t->t>3);
		//System.out.println(filtered);
		Stream<Integer> sortedList=filtered.sorted();
		
		//System.out.println(sortedList);
		Stream<Integer> nums3=sortedList.map(n->n*n).distinct();
				
//		num3.forEach(t->System.out.println(t));
	List<Integer> doublevalues=nums3.collect(Collectors.toList());
	
	
	System.out.println(doublevalues);
	
	
	
		// ArrayList<Integer> even=new ArrayList<>();
		// for(int i=0;i<nums.size();i++) {
		// 
		// Predicate<Integer> even1=new Predicate<Integer>() { 
		// @Override
		// public boolean test(Integer t) {
		// if(t%2==0) {
		// even.add(t);
		// return true;
		// }
		// return false;
		// }
		// };
		// even1.test(i);
		// }
		// System.out.println(even);
		System.out.println(nums.stream().filter(t->t>3).sorted().map(n->n*n).collect(Collectors.toList()));
		}
		

	
	
	
	
	
	

}
