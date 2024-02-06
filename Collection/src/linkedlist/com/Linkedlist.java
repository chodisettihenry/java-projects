package linkedlist.com;
import java.util.*;
public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Object>  alii = new LinkedList<Object>();
		 alii.add(90);
		 alii.add(20);
		 alii.add("ganesh");
		 alii.offer(50);
		 alii.push("raviiiii");
		 
		 
		int ava = alii.indexOf(90);
		 
		 System.out.println(alii);
		System.out.println(ava);
		
		System.out.println(alii);
		
		
		for(int i=0;i<alii.size();i++) { 
			//String avail = (String) alii.get(i);
			
			if(alii.get(i).equals("raviiiii")) {
				alii.pop();
				
			}
			
		}
		System.out.println();
		
		
		System.out.println(alii);
		
		

	}

}
