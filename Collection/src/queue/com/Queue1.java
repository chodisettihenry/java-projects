package queue.com;

import java.util.*;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q = new LinkedList<>();
		q.add(12);
		q.add(80);
		q.add(40);
		q.add(80);
//		boolean a = q.remove(80);
//		System.out.println(a);
//		System.out.println(q.peek());
//		System.out.println(q);
//		System.out.println(q.poll());
		
		System.out.println(q);
//		
		
	  Queue<Integer> qp = new PriorityQueue<>();
	qp.add(76);
	qp.add(88);
	qp.add(23);
	qp.add(89);
	qp.add(15);
	qp.add(100);
	qp.add(5);
	//System.out.println(qp.poll());
	  
	  
    System.out.println(qp);	  
			
		
		
//		q.forEach(v->System.out.println(v));
//		q.forEach(System.out::println);
    
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(1);
    pq.add(20);
    pq.add(30);
    pq.add(45);
    pq.add(10);
    pq.add(9);
    
    System.out.println(pq);
    
    
//    Deque<Integer> dqq = new LinkedList();
//    
//    dqq.add(23);
//    dqq.add(44);
//    dqq.add(28);
//    
//    System.out.println(dqq);
    
    
    
    
//Deque<Integer> dqq = new ArrayDeque<>();
//    
//    dqq.add(23);
//    dqq.add(44);
//    dqq.add(28);
//    
//    
//    System.out.println(dqq);
    
ArrayDeque<Integer> dqq = new ArrayDeque<>();
    
    dqq.add(23);
    dqq.add(44);
    dqq.add(28);
    
    
    
    System.out.println(dqq);



	}

}
