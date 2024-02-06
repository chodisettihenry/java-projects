package basic;

import java.util.Stack;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vc = new Vector();
		Stack<Integer> st = new Stack<>();
		st.push(2888);
		st.push(888);
		st.push(2222);
		
		st.push(70);
		st.add(6999);
		//st.pop();
		st.setSize(6);
		
		System.out.println(st.search(888));
		System.out.println(st);

	}

}
