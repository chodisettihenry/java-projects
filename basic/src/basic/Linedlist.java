package basic;

import java.util.Iterator;
import java.util.LinkedList;

public class Linedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.offer(20);
		list.offer(50);
		list.offer("gusi");
		
		
		System.out.println(list);
		
		
		Iterator iter = list.descendingIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		
		System.out.println(list);

	}

}
