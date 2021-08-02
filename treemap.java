package javap;

import java.util.Stack;

public class treemap {

	public static void main(String[] args) {
       Stack<String> s= new Stack<>();   
            s.push("A");
            s.push("B");
            s.push("C");
            System.out.println("letters" +s);
            s.pop();
            s.pop();
            s.push("G");
            s.peek();
            System.out.println(s.peek());
            System.out.println(s);
	}

}
