package javap;

import java.util.ArrayList;
import java.util.List;

public class newclass {
	public static void main(String[]args) {
		List<Integer> l=new ArrayList <>();
		l.add(3);
		l.add(4);
		l.add(5);
		for(int i=0;i<3;i++) {
			int sum=+l.add();
			System.out.println(sum);
			
		}
		
		
	}

}
