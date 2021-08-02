package javap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class cuboid {
	
	public static void main(String[] args) {
	
List<Integer> numberslist=new ArrayList<>()	;
       numberslist.add(10);	
       numberslist.add(20);
       numberslist.add(30);
	//List<Integer> squareslist=numberslist.stream().map(x->x*x).collect(Collectors.toList());
	
	//System.out.println(squareslist);
//	List<String> ls=new ArrayList<>();
//	ls.add("python");
//	ls.add("java");
//	ls.add("kotlin");
//	ls.add("scala");

//	List<String> filterResult=  ls.stream().filter(s->s.startsWith("p")).collect(Collectors.toList());
//         System.out.println(filterResult);
       int sum=numberslist.stream().reduce(0, (ans,i)->ans+i);
       System.out.println("sum of the all elements in the numberlist: "+sum);
       
}
	
	}


