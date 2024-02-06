package vector.com;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack obj = new Stack();
		
		obj.add(40);
		obj.add(1, 400);
		obj.push("First");
		
		System.out.println(obj);
		System.out.println(obj.capacity());
		obj.push(70);
		obj.push(60);
		obj.push(10);
		obj.push(200);
		obj.push(120);
		obj.push(130);
		obj.push(160);
		obj.push(190);
		System.out.println(obj.capacity());
	//	System.out.println(obj.ensureCapacity(20));
	
		
		obj.pop();
		System.out.println(obj);
		obj.remove(0);
		System.out.println(obj);
		obj.capacity();

	}

}
