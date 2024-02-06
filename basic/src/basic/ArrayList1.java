package basic;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(0, 20);
		list.add(30);
		list.add("ganesh");
		list.add("rahul");
		ArrayList list1 = new ArrayList();
		list1.add(9000);
	//	System.out.println(list1.contains(list));
	//	list1.forEach(t->System.out.println(t));
	  //  list1.forEach(System.out::println);
	    ArrayList<Integer> array = new ArrayList<>();
	    array.add(10);
	    array.add(20);
	    array.add(30);
	    array.add(59);
	   // array.notify();
	    System.out.println(array);
	    array.trimToSize();
	    System.out.println(array);
	    
	    
	    
	    
	    
	    
	    
	    
	   
		
	    list1.addAll(list);
	    
//		System.out.println(list);
//		System.out.println(list.clone());
//		System.out.println(list1);
//		System.out.println(list1.addAll(list1));
		

	}

}
