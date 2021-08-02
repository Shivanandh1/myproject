package javap;

import java.util.PriorityQueue;
import java.util.Queue;

public class queues {

	public static void main(String[] args) {
		Queue<String> Q=new PriorityQueue<>();
		Q.add("C");
		Q.add("A");
		Q.add("B");
		System.out.println("Queue is "+Q);
		Q.remove("A");
		System.out.println("Queue is "+Q);
		System.out.println(Q.peek()) ;
		System.out.println(Q.poll());
	}
	

}
